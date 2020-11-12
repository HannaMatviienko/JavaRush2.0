package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int numb = Integer.parseInt(line);

        if (numb < 0)
            System.out.println(numb + 1);

        if (numb > 0)
            System.out.println(numb * 2);

        if (numb == 0)
            System.out.println(0);
    }

}




