package com.logi.cec.app.ui.welcome

import com.logi.cec.app.ui.base.IPresenter

/**
 * Created by kvellaikannu on 04 : Jan : 2018.
 */

interface IWelcomePresenter<v : IWelcomeView> : IPresenter<v>{

    fun onNextClicked(state : Boolean)

}