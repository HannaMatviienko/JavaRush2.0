package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());

        if (x1 == x2 && x1 != x3)
            System.out.println(3);
        else if (x1 == x3 && x1 != x2)
            System.out.println(2);
        else if (x2 == x3 && x2 != x1)
            System.out.println(1);
    }
}
