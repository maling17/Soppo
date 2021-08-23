package com.soppo.soppo.model

import com.google.gson.annotations.SerializedName

data class TeamResponse(

	@field:SerializedName("values")
	val values: List<TeamItem?>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class TeamItem(

	@field:SerializedName("lose")
	val lose: Int? = null,

	@field:SerializedName("statusenabled")
	val statusenabled: Int? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("nameteam")
	val nameteam: String? = null,

	@field:SerializedName("draw")
	val draw: Int? = null,

	@field:SerializedName("region")
	val region: Int? = null,

	@field:SerializedName("norec")
	val norec: String? = null,

	@field:SerializedName("win")
	val win: Int? = null,

	@field:SerializedName("since")
	val since: String? = null
)
