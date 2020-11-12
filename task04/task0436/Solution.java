package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int m = Integer.parseInt(line);
        line = reader.readLine();
        int n = Integer.parseInt(line);
        String eight = "8";

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(eight);
            }
            System.out.println("");

        }
    }
}

