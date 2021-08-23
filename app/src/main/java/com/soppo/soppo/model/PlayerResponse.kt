package com.soppo.soppo.model

import com.google.gson.annotations.SerializedName

data class PlayerResponse(

	@field:SerializedName("values")
	val values: List<UserItem>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class UserItem(

	@field:SerializedName("regionfk")
	val regionfk: Int? = null,

	@field:SerializedName("birthdate")
	val birthdate: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("profilepict")
	val profilepict: String? = null,

	@field:SerializedName("statusenabled")
	val statusenabled: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("ktppict")
	val ktppict: String? = null,

	@field:SerializedName("norec")
	val norec: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("positionfk")
	val positionfk: Int? = null,

	@field:SerializedName("sexfk")
	val sexfk: Int? = null
)
