package com.soppo.soppo.model

import com.google.gson.annotations.SerializedName

data class AuthResponse(

    @field:SerializedName("success")
    val success: Boolean? = null,

    @field:SerializedName("currUser")
    val currUser: String? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("token")
    val token: String? = null,

    @field:SerializedName("values")
    val values: String? = null,
)
