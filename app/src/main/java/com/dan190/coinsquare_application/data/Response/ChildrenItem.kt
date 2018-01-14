package com.dan190.coinsquare_application.data.Response

import com.google.gson.annotations.SerializedName

data class ChildrenItem(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("kind")
	val kind: String? = null
)