package com.example.relearnkotlin.learn_object

class Point(val x: Int,val y: Int) {

    //用 operator 修饰符修饰即为重载，赋予 plus函数新的含义
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    // 重载运算符[]
    operator fun  get(index : Int): Any{
       return when(index){
            0-> x
            1-> y
            else -> Point(x,y)
        }
    }
}