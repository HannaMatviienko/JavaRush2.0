package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int d;

        if (a < b)
        {
            d = a;
            a = b;
            b = d;
        }

        if (b < c)
        {
            d = b;
            b = c;
            c = d;
        }

        if (a < b)
        {
            d = a;
            a = b;
            b = d;
        }

        if (b < c)
        {
            d = b;
            b = c;
            c = d;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
