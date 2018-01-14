package com.dan190.coinsquare_application.mvp

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by dougouk on 2018-01-13.
 */
abstract class BaseMvpActivity<in V : BaseMvpView, T: BaseMvpPresenter<V>> : AppCompatActivity(), BaseMvpView {
    protected abstract var presenter : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(srtResId: Int) {
        Toast.makeText(this, applicationContext.getString(srtResId), Toast.LENGTH_SHORT).show()
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, applicationContext.getString(stringResId), Toast.LENGTH_SHORT).show()
    }

    override fun getContext(): Context = this
}