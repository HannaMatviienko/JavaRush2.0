package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int x1 = Integer.parseInt(line);
        line = bufferedReader.readLine();
        int x2 = Integer.parseInt(line);
        line = bufferedReader.readLine();
        int x3 = Integer.parseInt(line);

        if (x1 == x2 && x1 == x3)
            System.out.println(x1 + " " + x2 + " " + x3);
        else if (x1 == x2)
            System.out.println(x1 + " " + x2);
        else if (x2 == x3)
            System.out.println(x2 + " " + x3);
        else if (x1 == x3)
            System.out.println(x1 + " " + x3);
    }
}