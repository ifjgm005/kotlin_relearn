package com.example.relearnkotlin.learn_object



/**
 *  object 的单例是没办法带着参数的
 *  但是使用伴生对象基于Java 的 DCL ( double check lock)的思想，用kotlin 实现也很简单
 * */
class Singleton private constructor(private val param: Int) {

    //伴生对象
    companion object {

        // instance 是一个可以为空的 Singleton的实例
        @Volatile
        private var instance: Singleton? = null

        // 对外 getInstance 方法
        fun getInstance(property: Int) =

            //若 instance 不为空，直接返回。若为空，返回后面 synchronized 锁的代码块。
            instance ?: synchronized(this) {

                //若 instance 不为空，则直接返回。若为空构建一个 Singleton 的实例，并赋值给 instance
                instance ?: Singleton(property).also { instance = it }
            }
    }
}