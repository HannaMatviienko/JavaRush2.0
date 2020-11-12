package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m = bufferedReader.readLine();
        int m1 = Integer.parseInt(m);

        System.out.println("Я буду зарабатывать $" + m1 + " в час");
    }
}
