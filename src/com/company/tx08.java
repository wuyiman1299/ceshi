package com.company;

import java.util.Scanner;

public class tx08 {
    public static void  main (String[]args) {
        tx888 sc = new tx888();
        /*接受成绩*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入java的成绩");
        sc.java = input.nextInt();
        System.out.println("请输入c的成绩");
        sc.c = input.nextInt();
        System.out.println("请输入db的成绩");
        sc.db = input.nextInt();
        /*计算并输出成绩*/
        //面向对象编程
        sc.calTotalScore();
        sc.showAvg();


    }
}
