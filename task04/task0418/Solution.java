package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int a = Integer.parseInt(line);
        line = bufferedReader.readLine();
        int b = Integer.parseInt(line);

        if (a > b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}