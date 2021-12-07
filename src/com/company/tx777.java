package com.company;

public class tx777 {
    /**
     *  变量的作用范围
     *        全局变量（静态变量）
     *        成员变量
     *        局部变量
     *
     *
     */

     //  静态变量（全局变量）  有默认值0 可以跨文件访问 不需要对象可以直接访问
            static int a ;

    // 成员变量  有默认值
    String name;  // 系统给定默认值 null
    int age;      // 0

    public void paly() {
        // 局部变量 ， 作用范围局限在方法中，且没有默认值
        int money = 99;
    }

}
