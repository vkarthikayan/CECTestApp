package com.logi.cec.app.ui.base

/**
 * Created by kvellaikannu on 04 : Jan : 2018.
 */
open class BasePresenter<V : IView> : IPresenter<V> {


    override fun onLeftAction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRightAction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var baseView : V

    override fun onAttach(view: V) {
        baseView = view
    }

    override fun onDetach(){

    }

    fun getView() : V {
        return baseView
    }

}