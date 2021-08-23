package com.soppo.soppo.network

import com.soppo.soppo.model.MatchResponse
import com.soppo.soppo.model.TeamResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface MatchApi {

    @GET("/v1/api/matchs/readmatchs")
    @Headers("Accept: application/json")
    suspend fun getListMatch(
        @Header("Authorization") token: String
    ): Response<MatchResponse>

    @GET("/v1/api/matchs/readmatch/{norec}")
    @Headers("Accept: application/json")
    suspend fun getMatch(
        @Header("Authorization") token: String,
        @Path("norec") norec: String
    ): Response<MatchResponse>

    @POST("/v1/api/matchs/creatematch")
    @Multipart
    suspend fun createMatch(
        @Header("Authorization") token: String,
        @Part("location") location: RequestBody,
        @Part("hometeamfk") hometeamfk: RequestBody,
        @Part("status") status: RequestBody,
        @Part photo: MultipartBody.Part?,
        @Part("playtime") playtime: RequestBody,
        @Part("matchdate") matchdate: RequestBody,
        @Part("description") description: RequestBody,
        @Part("roompassword") roompassword: RequestBody,

        ): Response<MatchResponse>


}