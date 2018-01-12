package com.logi.cec.app.ui.base

/**
 * Created by kvellaikannu on 04 : Jan : 2018.
 */

interface IPresenter<V : IView>{
      fun onAttach(view: V)
      fun onDetach()
      fun onLeftAction()
      fun onRightAction()
}
