package com.dan190.coinsquare_application.data.Response

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("data")
	val data: UpperData? = null,

	@field:SerializedName("kind")
	val kind: String? = null
)