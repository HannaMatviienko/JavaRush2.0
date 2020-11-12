package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int j;
        while(i < 11) {
            j = 1;
            while (j < 11) {
                System.out.print(j * i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
