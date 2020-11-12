package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int x = Integer.parseInt(line);
        int count = line.length();

        if (x > 0 && x < 1000) {

            String s1 = "";
            String s2 = "";
            if (count == 1)
                s2 = "однозначное";
            else if (count == 2)
                s2 = "двузначное";
            else if (count == 3)
                s2 = "трехзначное";

            if (x % 2 == 0)
                s1 = "четное";
            else
                s1 = "нечетное";

            System.out.println(s1 + " " + s2 + " число");
        }
    }
}
