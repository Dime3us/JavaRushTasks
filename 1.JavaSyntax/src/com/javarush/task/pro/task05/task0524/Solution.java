package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

import java.util.Arrays;

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        //напишите тут ваш код
        coordinates = new int[200];
        int count = 0;
        for (int i = 0; i < 200; i++) {
            coordinates[i] = count;
            if(i % 2 != 0)
                count+=9;
            else
                count++;
        }

    }
}