package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(6,1.17));
        System.out.println(convertEurToUsd(8, 1.17));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd;
        return usd = eur * course;
    }
}
