package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());

        if (number > 0) {
            number *= 2;
        } else if (number < 0) {
            number += 1;
        }

        System.out.println(number);
        reader.close();
    }

}