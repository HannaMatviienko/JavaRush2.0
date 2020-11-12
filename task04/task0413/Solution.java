package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        int numb = Integer.parseInt(line);

        if (numb == 1)
            System.out.println("понедельник");
        else if (numb == 2)
            System.out.println("вторник");
        else if (numb == 3)
            System.out.println("среда");
        else if (numb == 4)
            System.out.println("четверг");
        else if (numb == 5)
            System.out.println("пятница");
        else if (numb == 6)
            System.out.println("суббота");
        else if (numb == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}