package com.dan190.coinsquare_application.mvp

/**
 * Created by dougouk on 2018-01-13.
 */
open class BaseMvpPresenterImpl<V: BaseMvpView>: BaseMvpPresenter<V> {
    protected var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}