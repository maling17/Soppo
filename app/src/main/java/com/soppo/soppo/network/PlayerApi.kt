package com.soppo.soppo.network

import com.soppo.soppo.model.PlayerResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface PlayerApi {

    @GET("/v1/api/players/readplayers")
    @Headers("Accept: application/json")
    suspend fun getReadPlayers(
        @Header("Authorization") token: String?
    ):Response<PlayerResponse>

    @GET("/v1/api/players/readplayer/{norec}")
    @Headers("Accept: application/json")
    suspend fun getReadPlayer(
        @Header("Authorization") token: String?,
        @Path("norec")norec:String
    ):Response<PlayerResponse>

    @PUT("/v1/api/players/updateplayer")
    @Multipart
    suspend fun updatePlayer(
        @Header("Authorization") token: String,
        @Part("name") id: RequestBody,
        @Part("email") name: RequestBody,
        @Part("password") email: RequestBody,
        @Part("phone") phone: RequestBody,
        @Part("position") position: RequestBody,
        @Part photo: MultipartBody.Part?
    ): Response<PlayerResponse>
}