package com.soppo.soppo.repository.signin

import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.model.PlayerResponse
import com.soppo.soppo.utils.Resource

interface SignInRepository {

    suspend fun login(email:String,password:String):Resource<AuthResponse>
    suspend fun player(token:String):Resource<PlayerResponse>
}