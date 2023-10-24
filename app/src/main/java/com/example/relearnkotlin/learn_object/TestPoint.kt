package com.example.relearnkotlin.learn_object


fun main(args: Array<String>)  {
    //实例两个 Point
    val point = Point(1, 1)
    val point2 = Point(2, 2)

    //调用重载后的 plus函数
    val point3 = point.plus(point2)
    //使用重载运算符 + 调用plus 函数
    val point4 = point + point2

    //如果没有重载[] 运算符，
    // 那么我们自定义的 Point  是无法使用 [] 运算符的
    val index_x=point[0]
    val index_y=point[1]

}


