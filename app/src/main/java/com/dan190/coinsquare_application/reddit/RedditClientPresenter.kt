package com.dan190.coinsquare_application.reddit

import com.dan190.coinsquare_application.data.ApiManager
import com.dan190.coinsquare_application.data.Response.ChildrenItem
import com.dan190.coinsquare_application.data.Response.Response
import com.dan190.coinsquare_application.mvp.BaseMvpPresenterImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Created by dougouk on 2018-01-13.
 */
class RedditClientPresenter : BaseMvpPresenterImpl<RedditClientContract.View>(),
                                RedditClientContract.Presenter {
    val redditService = ApiManager.createRedditService()

    override fun retrieveTitles() {
        redditService.getTitles()
                .subscribeOn(Schedulers.io())
                .map { response: Response? -> response?.data?.children }
                .flatMapIterable { list -> list }
                .map { childrenItem: ChildrenItem? -> childrenItem?.data?.title!! }
                .toList()
                .map { list: MutableList<String>? -> Timber.d(list?.toString()); list }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list: MutableList<String>?, throwable: Throwable? ->
                    if (list != null) view?.showTitles(list.toList())
                    view?.hideLoading()
                }
    }

}