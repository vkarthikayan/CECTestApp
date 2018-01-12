package com.logi.cec.app.ui.welcome

import anartzmuxika.connectionchangereceiver.NetworkUtil
import android.os.Bundle
import android.widget.Button
import com.logi.cec.app.R
import com.logi.cec.app.ui.enterName.getEnterNameActivity
import com.logi.cec.app.ui.base.BaseActivity
import com.logi.cec.app.ui.common.Constants

/**
 * Created by kvellaikannu on 04 : Jan : 2018.
 */
class WelcomeActivity : BaseActivity(), IWelcomeView {

    private val welcomePresenter: IWelcomePresenter<IWelcomeView> = WelcomePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        welcomePresenter.onAttach(this)

        val button = findViewById<Button>(R.id.nxt_button)
        button.setOnClickListener({
            val status =NetworkUtil.getConnectivityStatusString(this)
            welcomePresenter.onNextClicked(!status.equals(Constants.NOT_CONNECT))
        })

    }


    override fun showNoInternet() {
    }

    override fun showEnterName() {
        startActivity(getEnterNameActivity())
    }

}