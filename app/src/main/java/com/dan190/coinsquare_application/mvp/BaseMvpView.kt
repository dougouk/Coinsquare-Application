package com.dan190.coinsquare_application.mvp

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by dougouk on 2018-01-13.
 */
interface BaseMvpView {

    fun showMessage(message: String)

    fun showMessage(@StringRes srtResId: Int)

    fun showError(error: String)

    fun showError(@StringRes stringResId: Int)

    fun getContext() : Context

}