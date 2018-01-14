# Coinsqure Android Developer Application
Simple Reddit client that pulls data from https://www.reddit.com/.json and displays the list of titles

<img src="demo.gif" width="300" height="500"/>

Time it took: **1 hour 13 minutes**

Prioritized **clean architecture** over UI fanciness

## Architecture
Implemented with MVP architecture.
* Very scalable in terms of features
* Easy to debug
* Extra features will be take less time to implement
* Easy to change the UI, add animations

## Network call
Retrofit with Rx and Gson adapters
* Simple, easy-to-understand-and-write code

## Framework
Kotlin with RxJava bindings, RxAndroid

## How it works
For every user flow (in this case, the Reddit titles), there is a
`Contract` between the `View` and the `Presenter`. The `Presenter` will
call the `ApiManager` to create a retrofit instance of `RedditService`,
and retrieve the list of titles. Upon successfully downloading the list
of titles, it will send the list to the `View`.