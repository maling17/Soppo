package com.soppo.soppo.repository.signup

import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.network.AuthApi
import com.soppo.soppo.utils.Resource
import javax.inject.Inject

class DefaultSignUpRepository @Inject constructor(val api: AuthApi) : SignUpRepository {
    override suspend fun register(
        email: String,
        password: String,
        name: String,
        phone: String
    ): Resource<AuthResponse> {
        return try {
            val response = api.register(email, password, name, phone)
            val data = response.body()
            if (response.isSuccessful && data != null) {
                Resource.Success(data)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message!!)
        }
    }
}