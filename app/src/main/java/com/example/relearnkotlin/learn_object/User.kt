package com.example.relearnkotlin.learn_object

class User(val male: Int){
    companion object {
        val MALE = 0
        fun isMale(male:Int) = male == MALE
    }
}