package com.soppo.soppo.view.auth.signIn

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.model.PlayerResponse
import com.soppo.soppo.repository.signin.SignInRepository
import com.soppo.soppo.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SignInViewModel @Inject constructor(private val repository: SignInRepository) : ViewModel() {

    sealed class SignInEvent {
        class Success(val response: AuthResponse) : SignInEvent()
        class Failure(val errorText: String) : SignInEvent()
        object Loading : SignInEvent()
        object Empty : SignInEvent()
    }

    sealed class PlayerEvent {
        class Success(val response: PlayerResponse) : PlayerEvent()
        class Failure(val errorText: String) : PlayerEvent()
        object Loading : PlayerEvent()
        object Empty : PlayerEvent()
    }

    private val _login = MutableStateFlow<SignInEvent>(SignInEvent.Empty)
    val login: StateFlow<SignInEvent> = _login

    private val _player = MutableStateFlow<PlayerEvent>(PlayerEvent.Empty)
    val player: StateFlow<PlayerEvent> = _player

    fun checkLogin(email: String, password: String) = viewModelScope.launch {
        _login.value = SignInEvent.Loading

        when (val loginResponse = repository.login(email, password)) {

            is Resource.Error -> _login.value = SignInEvent.Failure(loginResponse.message!!)
            is Resource.Success -> {
                val data = loginResponse.data
                _login.value = SignInEvent.Success(data!!)
            }
        }

    }

    fun getPlayer(token: String) = viewModelScope.launch {
        _player.value = PlayerEvent.Loading

        when (val loginResponse = repository.player(token)) {

            is Resource.Error -> _player.value = PlayerEvent.Failure(loginResponse.message!!)
            is Resource.Success -> {
                val data = loginResponse.data
                _player.value = PlayerEvent.Success(data!!)
            }
        }

    }
}