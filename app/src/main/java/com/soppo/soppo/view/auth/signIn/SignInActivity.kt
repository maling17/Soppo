package com.soppo.soppo.view.auth.signIn

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.soppo.soppo.databinding.ActivitySignInBinding
import com.soppo.soppo.utils.Preferences
import com.soppo.soppo.view.MainActivity
import com.soppo.soppo.view.auth.signUp.SignUpActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect


@AndroidEntryPoint
class SignInActivity : AppCompatActivity() {

    val viewModel: SignInViewModel by viewModels()
    lateinit var preferences: Preferences
    lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences = Preferences(this)

        binding.btnSignIn.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            viewModel.checkLogin(email, password)
        }

        binding.tvSignUp.setOnClickListener {
            Intent(this@SignInActivity, SignUpActivity::class.java).also { startActivity(it) }
        }
        lifecycleScope.launchWhenCreated {
            viewModel.login.collect { event ->

                when (event) {
                    is SignInViewModel.SignInEvent.Success -> {
                        isNotLoading()
                        val token = event.response.token
                        preferences.setValues("token", "Bearer $token")
                       /* Intent(this@SignInActivity, MainActivity::class.java).also {
                            startActivity(
                                it
                            )
                        }*/
                        viewModel.getPlayer("Bearer $token")
                    }
                    is SignInViewModel.SignInEvent.Failure -> {

                        isNotLoading()
                        Toast.makeText(this@SignInActivity, event.errorText, Toast.LENGTH_SHORT)
                            .show()
                    }
                    is SignInViewModel.SignInEvent.Loading -> isLoading()
                    else -> Unit
                }
            }
        }

        lifecycleScope.launchWhenCreated {
            viewModel.player.collect { event ->
                when (event) {
                    is SignInViewModel.PlayerEvent.Success -> {
                        isNotLoading()
                        val token = event.response
                        Log.d("TAG", "onCreate: ${token.values}")

                    }
                    is SignInViewModel.PlayerEvent.Failure -> {

                        isNotLoading()
                        Toast.makeText(this@SignInActivity, event.errorText, Toast.LENGTH_SHORT)
                            .show()
                    }
                    is SignInViewModel.PlayerEvent.Loading -> isLoading()
                    else -> Unit
                }
            }
        }
    }

    fun isLoading() {
        binding.btnSignIn.visibility = View.INVISIBLE
        binding.pbSignIn.isVisible = true
    }

    fun isNotLoading() {
        binding.btnSignIn.visibility = View.VISIBLE
        binding.pbSignIn.isVisible = false
    }
}