package com.dan190.coinsquare_application.reddit

import android.content.Context
import android.widget.TextView
import com.dan190.coinsquare_application.R
import com.mindorks.placeholderview.Animation
import com.mindorks.placeholderview.PlaceHolderView
import com.mindorks.placeholderview.annotations.*

/**
 * Created by dougouk on 2018-01-13.
 */
@Animate(Animation.ENTER_TOP_ASC)
@NonReusable
@Layout(R.layout.item_reddit_title)
class RedditTitleAdapter(val context: Context, val placeHolderView: PlaceHolderView, val title: String) {
    @View(R.id.title)
    val titleTextView : TextView? = null

    @Resolve
    fun onResolved() {
        titleTextView?.text = title
    }
}