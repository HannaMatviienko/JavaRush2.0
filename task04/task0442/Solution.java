package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        int i = 0;
        int j = 0;
        while(j != -1){
            i = i + j;
            j = Integer.parseInt(reader.readLine());
        }
        System.out.println(i - 1);
    }
}
