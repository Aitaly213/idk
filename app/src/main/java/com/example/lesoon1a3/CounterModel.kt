package com.example.lesoon1a3

class CounterModel {

    private var count = 0

    fun inc(){
        count++
    }

    fun dec(){
        count--
    }

    fun getResult() = count
}