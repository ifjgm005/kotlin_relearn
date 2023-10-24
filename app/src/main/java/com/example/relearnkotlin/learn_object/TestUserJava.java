package com.example.relearnkotlin.learn_object;

/**
 * @author : Axes
 * create at:  2023-10-23  18:07
 * @description: java 调用伴生对象
 */
public class TestUserJava {
    public void test(){
        User.Companion.getMALE();
        User.Companion.isMale(1);
    }
}
