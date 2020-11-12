package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int a = Integer.parseInt(line);
        line = reader.readLine();
        int b = Integer.parseInt(line);
        line = reader.readLine();
        int c = Integer.parseInt(line);

        if((a<=b&&a>=c)||(a<=c&&a>=b))
            System.out.println(a);
        else if((b<=a&&b>=c)||(b<=c&&b>=a))
            System.out.println(b);
        else
            System.out.println(c);

    }
}
