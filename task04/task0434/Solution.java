package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
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
