package com.soppo.soppo.view.auth.signUp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.repository.signup.SignUpRepository
import com.soppo.soppo.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(val repository: SignUpRepository) : ViewModel() {


    sealed class SignUpEvent {
        class Success(val authResponse: AuthResponse) : SignUpEvent()
        class Failure(val errorText: String) : SignUpEvent()
        object Loading : SignUpEvent()
        object Empty : SignUpEvent()
    }

    private val _register = MutableStateFlow<SignUpEvent>(SignUpEvent.Empty)
    val register: StateFlow<SignUpEvent> = _register

    fun registerUser(email: String, password: String, name: String, phone: String) =
        viewModelScope.launch {
            _register.value = SignUpEvent.Loading

            when (val registerResponse = repository.register(email, password, name, phone)) {
                is Resource.Error -> _register.value =
                    SignUpEvent.Failure(registerResponse.message!!)
                is Resource.Success -> {
                    val data = registerResponse.data
                    _register.value = SignUpEvent.Success(data!!)
                }
            }
        }

}