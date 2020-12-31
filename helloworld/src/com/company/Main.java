package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
         * 这是一个菲波拉契数列问题
         * {斐波拉契数列原理：除开前两项 后面每位数等于前两项相加之和}
         * 1.通过中间值来保存上一月兔子的和
         * 2.在将上一月兔子这一月兔子相加 得到下一月数量和
         */
        int rabbit = 1; //上月兔子的数量和
        int newRabbit = 1; //这一月生成兔子的数量和
        int count; //中间值 用来存数量的
        int month = 24;

        System.out.println("第1月兔子 1 对");
        System.out.println("第2月兔子 1 对");
        //从第三月起
        for(int i= 3 ; i <= month; i++){
            count = newRabbit;
            newRabbit = rabbit + newRabbit;
            rabbit = count;
            System.out.println("第"+i+"月兔子 "+newRabbit+" 对");
        }
    }
}

