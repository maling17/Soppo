package com.soppo.soppo.network

import com.soppo.soppo.model.AuthResponse
import com.soppo.soppo.model.PlayerResponse
import retrofit2.Response
import retrofit2.http.*

interface AuthApi {

    @FormUrlEncoded
    @POST("/v1/api/auth/registration")
    suspend fun register(
        @Field("email") email: String,
        @Field("password") password:String,
        @Field("name") name:String,
        @Field("phone") phone:String
        ):Response<AuthResponse>

    @FormUrlEncoded
    @POST("/v1/api/auth/login")
    suspend fun login(
        @Field("email")email: String,
        @Field("password")password: String
    ):Response<AuthResponse>

    @FormUrlEncoded
    @POST("/v1/api/auth/verifyotpcode")
    suspend fun verificationOtp(
        @Field("email")email: String,
        @Field("otpcode")code:Int
    ):Response<AuthResponse>

    @GET("/v1/api/players/readplayers")
    @Headers("Accept: application/json")
    suspend fun getReadPlayers(
        @Header("Authorization") token: String?
    ):Response<PlayerResponse>
}