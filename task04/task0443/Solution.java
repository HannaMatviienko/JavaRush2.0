package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String y = reader.readLine();
        String m = reader.readLine();
        String d = reader.readLine();


        System.out.println("Меня зовут " + name +"."+"\n"+
                "Я родился " + d + "." + m + "." + y);
    }

}
