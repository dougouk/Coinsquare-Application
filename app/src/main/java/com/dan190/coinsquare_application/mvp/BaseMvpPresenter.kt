package com.dan190.coinsquare_application.mvp

/**
 * Created by dougouk on 2018-01-13.
 */
interface BaseMvpPresenter<in V : BaseMvpView> {
    fun attachView(view : V)

    fun detachView()
}