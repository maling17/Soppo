package com.soppo.soppo.view.auth.signUp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.soppo.soppo.R
import com.soppo.soppo.databinding.ActivitySignUpBinding
import com.soppo.soppo.utils.Preferences
import com.soppo.soppo.view.auth.code.CodeOtpActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class SignUpActivity : AppCompatActivity() {

    val viewModel: SignUpViewModel by viewModels()
    lateinit var binding: ActivitySignUpBinding
    lateinit var preferences: Preferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences = Preferences(this)
        binding.btnSignUp.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val fullname = binding.etFullname.text.toString()
            val phone = binding.etPhone.text.toString()
            val password = binding.etPassword.text.toString()

            if (checkValidation()){
                viewModel.registerUser(email,password,fullname,phone)
            }
        }

        lifecycleScope.launchWhenCreated {
            viewModel.register.collect { event ->
                when (event) {
                    is SignUpViewModel.SignUpEvent.Success -> {
                        isNotLoading()
                        Toast.makeText(
                            this@SignUpActivity,
                            event.authResponse.values,
                            Toast.LENGTH_SHORT
                        ).show()
                        preferences.setValues("token", "Bearer ${event.authResponse.token}")
                        Intent(
                            this@SignUpActivity,
                            CodeOtpActivity::class.java
                        ).also { startActivity(it) }
                    }
                    is SignUpViewModel.SignUpEvent.Failure -> {
                        isNotLoading()
                        Toast.makeText(this@SignUpActivity, event.errorText, Toast.LENGTH_SHORT)
                            .show()
                    }
                    is SignUpViewModel.SignUpEvent.Loading -> {
                        isLoading()
                    }
                    else -> Unit
                }
            }
        }
    }

    private fun isLoading() {
        binding.btnSignUp.visibility = View.INVISIBLE
        binding.pbSignUp.isVisible = true
    }

    private fun isNotLoading() {
        binding.btnSignUp.visibility = View.VISIBLE
        binding.pbSignUp.isVisible = false
    }

    private fun checkValidation(): Boolean {
        return when {
            binding.etEmail.text!!.isEmpty() -> {
                binding.etEmail.error = getString(R.string.please_fill_this_field)
                false
            }
            binding.etFullname.text!!.isEmpty() -> {
                binding.etFullname.error = getString(R.string.please_fill_this_field)
                false
            }
            binding.etPhone.text!!.isEmpty() -> {
                binding.etPhone.error = getString(R.string.please_fill_this_field)
                false
            }
            binding.etPassword.text!!.isEmpty() -> {
                binding.etPassword.error = getString(R.string.please_fill_this_field)
                false
            }
            binding.etConfirmPassword.text!!.isEmpty() -> {
                binding.etConfirmPassword.error = getString(R.string.please_fill_this_field)
                false
            }
            binding.etPassword.text.toString() != binding.etConfirmPassword.text.toString() -> {
                binding.etPassword.error =
                    getString(R.string.field_password_and_confirm_password_not_same)
                false
            }
            else -> {
                true
            }
        }

    }
}