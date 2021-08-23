package com.soppo.soppo.repository.signup

import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.utils.Resource

interface SignUpRepository {

    suspend fun register(
        email: String,
        password: String,
        name: String,
        phone: String
    ): Resource<AuthResponse>
}