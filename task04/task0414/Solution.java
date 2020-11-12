package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int xline = Integer.parseInt(line);

        if (xline % 4 == 0) {
            if(xline % 400 != 0 && xline % 100 == 0 )
                System.out.println("количество дней в году: 365");
            else
                System.out.println("количество дней в году: 366");
        }   else
            System.out.println("количество дней в году: 365");
    }
}