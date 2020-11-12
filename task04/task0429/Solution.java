package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());

        int count1 = 0;
        int count2 = 0;


        if (x1 > 0)
            count1 = count1 + 1;
        else if (x1 < 0)
            count2 = count2 + 1;

        if (x2 > 0)
            count1 = count1 + 1;
        else if (x2 < 0)
            count2 = count2 + 1;

        if (x3 > 0)
            count1 = count1 + 1;
        else if (x3 < 0)
            count2 = count2 + 1;

        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);

    }
}
