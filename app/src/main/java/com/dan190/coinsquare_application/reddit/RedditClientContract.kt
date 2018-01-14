package com.dan190.coinsquare_application.reddit

import com.dan190.coinsquare_application.mvp.BaseMvpPresenter
import com.dan190.coinsquare_application.mvp.BaseMvpView

/**
 * Created by dougouk on 2018-01-13.
 */
interface RedditClientContract {
    interface View : BaseMvpView {
        fun showTitles(listOfTitles: List<String>)

        fun showLoading()

        fun hideLoading()
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun retrieveTitles()
    }
}