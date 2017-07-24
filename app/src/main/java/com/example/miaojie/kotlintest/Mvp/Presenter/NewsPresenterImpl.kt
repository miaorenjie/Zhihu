package com.example.miaojie.kotlintest.Mvp.Presenter

import com.example.miaojie.kotlintest.Mvp.Model.NewsBiz
import com.example.miaojie.kotlintest.Mvp.View.INewsView

/**
 * Created by miaorenjie_sx on 2017/7/24.
 */
class NewsPresenterImpl:INewsPresenter<INewsView>
{
    lateinit var view:INewsView
    lateinit var newsBiz:NewsBiz

    override fun onLoadHotestSucceed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attachView(view: INewsView) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        this.view
    }

    override fun detachView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadHotestFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadLatestSucceed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadLatestFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadBerforeSucceed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoadBerforeFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}