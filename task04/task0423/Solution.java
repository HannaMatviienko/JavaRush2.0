package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String name = bufferedReader.readLine();
        String line = bufferedReader.readLine();
        int a = Integer.parseInt(line);

        if (a > 20)
            System.out.println("И 18-ти достаточно");
    }
}
