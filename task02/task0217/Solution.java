package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {


    public static int min(int a, int b, int c, int d) {

        int m = min(a,b);
        int m2 = min(c,d);
        int m3 = min(m,m2);
        return m3;
    }

    public static int min(int a, int b) {
        int m1;
        if (a < b)
            m1 = a;
        else
            m1 = b;

        return m1;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}