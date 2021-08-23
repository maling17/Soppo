package com.soppo.soppo.model

import com.google.gson.annotations.SerializedName

data class MatchResponse(

	@field:SerializedName("values")
	val values: List<MatchItem>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class MatchItem(

	@field:SerializedName("homescore")
	val homescore: Int? = null,

	@field:SerializedName("awayteamfk")
	val awayteamfk: String? = null,

	@field:SerializedName("hometeamfk")
	val hometeamfk: String? = null,

	@field:SerializedName("statusenabled")
	val statusenabled: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("requestdate")
	val requestdate: Any? = null,

	@field:SerializedName("playtime")
	val playtime: String? = null,

	@field:SerializedName("norec")
	val norec: String? = null,

	@field:SerializedName("awayscore")
	val awayscore: Int? = null,

	@field:SerializedName("matchdate")
	val matchdate: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("roompassword")
	val roompassword: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
