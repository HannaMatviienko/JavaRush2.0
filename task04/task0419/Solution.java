package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        line = bufferedReader.readLine();
        int d = Integer.parseInt(line);

        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= c && d >= b)
            System.out.println(d);
    }
}
