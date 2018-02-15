package com.livin.android.bookstore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/*
 * Created by Livin Mathew <mail@livinmathew.me> on 17/10/17.
 */

class Login : AppCompatActivity() {

    private val username = "gdgcochin"
    private val password = "devday"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

}
