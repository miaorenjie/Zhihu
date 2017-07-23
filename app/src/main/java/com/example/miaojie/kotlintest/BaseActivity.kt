package com.example.miaojie.kotlintest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by miaorenjie_sx on 2017/7/21.
 */
 open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }
    protected fun initView()
    {
        setSupportActionBar(toolBar)
    }
    protected fun showSnackbar(view:View,message:String)
    {
        Snackbar.make(view,message,Snackbar.LENGTH_SHORT).show()
    }
    protected fun showToast(context:Context,message: String)
    {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }



}