package com.example.miaojie.kotlintest.Mvp.Presenter

import android.view.View

/**
 * Created by miaorenjie_sx on 2017/7/24.
 */
open interface IBasePresenter<V>{
    fun attachView(view: V)
    fun detachView()
}