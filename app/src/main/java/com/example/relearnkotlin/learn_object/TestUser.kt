package com.example.relearnkotlin.learn_object

//用来测试 User 类中的伴生对象。
class TestUser {
    //调用User 方法
    fun test(){
        //可以看到可以像
        User.MALE
        User.isMale(1)
    }
}