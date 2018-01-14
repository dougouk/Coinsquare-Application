package com.dan190.coinsquare_application.data

import com.dan190.coinsquare_application.data.Response.Response
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by dougouk on 2018-01-13.
 */
interface RedditService {
    @GET("/.json")
    fun getTitles() : Observable<Response>
}