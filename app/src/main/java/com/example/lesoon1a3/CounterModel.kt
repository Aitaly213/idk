package com.example.lesoon1a3

class CounterModel {

    private var count = 0

    fun inc(){
        count++
    }

    fun dec(){
        count--
    }

    fun isCountEqualToTen(count:Int) : Boolean{
        if (count == 10){
            return true
        }else{
            return false
        }
    }

    fun isCountEqualToFifteen(count:Int) : Boolean{
        if (count == 15){
            return true
        }else{
            return false
        }
    }

    fun getResult() = count
}