package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String lion = reader.readLine();
        String line = reader.readLine();
        int N = Integer.parseInt(line);

        while (N > 0) {
            System.out.println(lion);
            N--;
        }
    }
}
