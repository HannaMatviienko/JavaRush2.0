package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());

        int count = 0;


        if (x1 > 0)
            count = count + 1;
        if (x2 > 0)
            count = count + 1;
        if (x3 > 0)
            count = count + 1;

        System.out.println(count);

    }
}
