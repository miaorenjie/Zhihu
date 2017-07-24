package com.example.miaojie.kotlintest.Mvp.View

/**
 * Created by miaorenjie_sx on 2017/7/24.
 */
open interface IBaseView{
    fun showMsg(message:String)
    fun showLoad()
    fun hideLoad()
}