package com.javarush.task.task04.task0415;

/* 
Правило треугольника
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
        line = bufferedReader.readLine();
        int c = Integer.parseInt(line);

        if (a + b > c && b + c > a && a + c > b)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}