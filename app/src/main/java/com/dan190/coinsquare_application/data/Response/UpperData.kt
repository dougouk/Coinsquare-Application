package com.dan190.coinsquare_application.data.Response

import com.google.gson.annotations.SerializedName

/**
 * Created by dougouk on 2018-01-14.
 */
data class UpperData (

    @field:SerializedName("modhash")
    val modhash: String? = null,

    @field:SerializedName("whitelist_status")
    val whitelist_status: String? = null,

    @field:SerializedName("children")
    val children: List<ChildrenItem>? = null,

    @field:SerializedName("after")
    val after: String? = null,

    @field:SerializedName("before")
    val before: String? = null
)