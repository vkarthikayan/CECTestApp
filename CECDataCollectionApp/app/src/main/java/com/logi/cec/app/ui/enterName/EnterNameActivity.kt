package com.logi.cec.app.ui.enterName

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.logi.cec.app.R
import com.logi.cec.app.ui.base.BaseActivity

/**
 * Created by kvellaikannu on 06 : Jan : 2018.
 */

class EnterNameActivity: BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_name)
    }
}

fun Context.getEnterNameActivity(): Intent {
    return Intent(this, EnterNameActivity::class.java).apply {}
}