package com.example.miaojie.kotlintest.Mvp.View

import com.example.miaojie.kotlintest.Mvp.Model.BeforeNewsBean
import com.example.miaojie.kotlintest.Mvp.Model.HotestNewsBean

/**
 * Created by miaorenjie_sx on 2017/7/24.
 */
interface INewsView:IBaseView{
    fun showHotestNews(newsBeans: ArrayList<HotestNewsBean>)
    fun showBeforeNews(newsBeans: ArrayList<BeforeNewsBean>)
}