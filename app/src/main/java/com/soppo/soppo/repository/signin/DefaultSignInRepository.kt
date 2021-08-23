package com.soppo.soppo.repository.signin

import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.model.PlayerResponse
import com.soppo.soppo.network.AuthApi
import com.soppo.soppo.utils.Resource
import javax.inject.Inject

class DefaultSignInRepository @Inject constructor(val api: AuthApi) : SignInRepository {
    override suspend fun login(email: String, password: String): Resource<AuthResponse> {

        return try {
            val response = api.login(email, password)
            val result = response.body()

            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            return Resource.Error(e.message!!)
        }

    }

    override suspend fun player(token: String): Resource<PlayerResponse> {
        return try {
            val response = api.getReadPlayers(token)
            val result = response.body()

            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            return Resource.Error(e.message!!)
        }
    }
}