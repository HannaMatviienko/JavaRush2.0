package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        String cAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        int yAge = Integer.parseInt(cAge);

        System.out.println(name + " получает " + nAge + " через " + cAge + " лет.");
    }
}
