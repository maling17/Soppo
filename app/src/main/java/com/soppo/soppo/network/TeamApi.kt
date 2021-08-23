package com.soppo.soppo.network

import com.soppo.soppo.model.PlayerResponse
import com.soppo.soppo.model.ShowPlayerResponse
import com.soppo.soppo.model.TeamResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface TeamApi {

    @GET("/v1/api/teams/readteams")
    @Headers("Accept: application/json")
    suspend fun getListTeams(
        @Header("Authorization") token: String
    ): Response<TeamResponse>

    @GET("/v1/api/teams/readteam/{norec}")
    @Headers("Accept: application/json")
    suspend fun getTeam(
        @Header("Authorization") token: String,
        @Path("norec") norec: String
    ): Response<TeamResponse>

    @POST("/v1/api/teams/createteam")
    @Multipart
    suspend fun createTeam(
        @Header("Authorization") token: String,
        @Part("nameteam") nameteam: RequestBody,
        @Part photo: MultipartBody.Part?,
        @Part("region") region: RequestBody,
        @Part("description") description: RequestBody,

    ): Response<TeamResponse>

    @PUT("/v1/api/teams/updateteam")
    @Multipart
    suspend fun updateTeam(
        @Header("Authorization") token: String,
        @Part("nameteam") nameteam: RequestBody,
        @Part photo: MultipartBody.Part?,
        @Part("region") region: RequestBody,
        @Part("description") description: RequestBody,
        @Part("norec") norec: RequestBody,
        ): Response<TeamResponse>

    @GET("/v1/apib/teams/teamtoplayer/player/{norec}")
    @Headers("Accept: application/json")
    suspend fun getShowPlayer(
        @Header("Authorization") token: String,
        @Path("norec") norec: String
    ): Response<ShowPlayerResponse>
}