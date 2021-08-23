package com.soppo.soppo.model

import com.google.gson.annotations.SerializedName

data class ShowPlayerResponse(

	@field:SerializedName("values")
	val values: List<ShowPlayerItem>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class ShowPlayerItem(

	@field:SerializedName("playerstatusinteamfk")
	val playerstatusinteamfk: Int? = null,

	@field:SerializedName("regionfk")
	val regionfk: Any? = null,

	@field:SerializedName("birthdate")
	val birthdate: Any? = null,

	@field:SerializedName("playerfk")
	val playerfk: String? = null,

	@field:SerializedName("statusenabled")
	val statusenabled: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("norec")
	val norec: String? = null,

	@field:SerializedName("teamfk")
	val teamfk: String? = null,

	@field:SerializedName("sexfk")
	val sexfk: Any? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("profilepict")
	val profilepict: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("ktppict")
	val ktppict: Any? = null,

	@field:SerializedName("positionfk")
	val positionfk: Any? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("since")
	val since: String? = null
)
