package com.example.miaojie.kotlintest.Mvp.Presenter

/**
 * Created by miaorenjie_sx on 2017/7/24.
 */
interface INewsPresenter<V>:IBasePresenter<V>{
    //加载热文
    fun onLoadHotestSucceed()
    fun onLoadHotestFailed()

    fun onLoadLatestSucceed()
    fun onLoadLatestFailed()

    fun onLoadBerforeSucceed()
    fun onLoadBerforeFailed()
}