package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int a1 = number % 100;
        int b = a1 / 10;
        int c = a1 % 10;
        int d = a + b + c;
        return d;
    }
}