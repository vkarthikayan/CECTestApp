package com.logi.cec.app.ui.welcome

import anartzmuxika.connectionchangereceiver.NetworkUtil
import android.util.Log
import com.logi.cec.app.ui.base.BasePresenter

/**
 * Created by kvellaikannu on 04 : Jan : 2018.
 */


class WelcomePresenter<v : IWelcomeView>: BasePresenter<v>(), IWelcomePresenter<v>{


    override fun onNextClicked(connected : Boolean) {
        Log.d("onNextClicked","in")
        if(connected)
            getView().showEnterName()
        else
            getView().showNoInternet()
    }

}