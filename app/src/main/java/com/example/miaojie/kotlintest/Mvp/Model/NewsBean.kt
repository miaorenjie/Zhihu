package com.example.miaojie.kotlintest.Mvp.Model

/**
 * Created by miaorenjie_sx on 2017/7/23.
 */
data class LatestNewsBean(val date:String?,val title:String?,val imageUrl:String,val news_id:Int)
data class DetailNewsBean(val body:String, val title: String?, val completionImgUrl:String,val compressImgUrl:String)
data class BeforeNewsBean(val date:String?,val title:String?,val imageUrl:String,val news_id:Int)
data class HotestNewsBean(val date:String?,val title:String?,val imageUrl:String,val news_id:Int)