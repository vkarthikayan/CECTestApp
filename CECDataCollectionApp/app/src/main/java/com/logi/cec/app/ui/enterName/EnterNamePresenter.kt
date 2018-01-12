package com.logi.cec.app.ui.enterName

import com.logi.cec.app.ui.base.BasePresenter
import com.logi.cec.app.ui.base.IView

/**
 * Created by kvellaikannu on 06 : Jan : 2018.
 */

class EnterNamePresenter<v : IEnterNameView> : BasePresenter<v>() , IEnterNamePresenter<v>{

    override fun onNextClicked() {
        getView().shoeCECDevicePairing()
    }

}