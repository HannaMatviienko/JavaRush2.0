package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String s = "S";
        int j;
        while (i < 10)
        {
            j = 0;
            while (j < 10){
                System.out.print(s);
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
