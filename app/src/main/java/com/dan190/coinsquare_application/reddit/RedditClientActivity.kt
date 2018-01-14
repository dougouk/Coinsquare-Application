package com.dan190.coinsquare_application.reddit

import android.os.Bundle
import android.view.View
import com.dan190.coinsquare_application.R
import com.dan190.coinsquare_application.mvp.BaseMvpActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_reddit.*
import timber.log.Timber

/**
 * Created by dougouk on 2018-01-13.
 */
class RedditClientActivity : BaseMvpActivity<RedditClientContract.View, RedditClientContract.Presenter>(),
    RedditClientContract.View {

    override var presenter: RedditClientContract.Presenter = RedditClientPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reddit)

        swipeRefresh?.setOnRefreshListener { getRedditTitles() }
        getRedditTitles()
    }

    fun getRedditTitles() {
        presenter.retrieveTitles()
    }

    override fun showTitles(listOfTitles: List<String>) {
        Observable.just(listOfTitles)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    placeHolderView?.removeAllViews()
                    for (title in list) {
                        if (placeHolderView != null) {
                            Timber.d(title)
                            val row = RedditTitleAdapter(this, placeHolderView, title)
                            placeHolderView?.addView(row)
                        }
                    }
                }
    }

    override fun showLoading() {
        swipeRefresh?.isRefreshing = true
    }


    override fun hideLoading() {
        swipeRefresh?.isRefreshing = false
    }

}