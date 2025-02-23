package com.example.lesoon1a3

class CounterPresenter {

    private val model= CounterModel()
    private var view: CounterView?= null

    fun attachView(view:CounterView){
        this.view = view
    }

    fun onIncrement(){
        model.inc()
        view?.updateCount(model.getResult())
    }

    fun onEqualToTen(){
        if (model.isCountEqualToTen(model.getResult())){
            view?.showToast()
        }
    }

    fun onEqualToFifteen(){
        if (model.isCountEqualToFifteen(model.getResult())){
            view?.turnCountToGreen()
        }else{
            view?.turnCountToBlack()
        }
    }

    fun onDecrement(){
        model.dec()
        view?.updateCount(model.getResult())
    }

    fun detachView(){
        this.view = null
    }
}