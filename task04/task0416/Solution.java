package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int t = (int)Double.parseDouble(line);
        int x = t % 5;

        if (x < 3)
            System.out.println("зелёный");
        else if (x == 3)
            System.out.println("желтый");
        else if (x == 4)
            System.out.println("красный");


    }
}