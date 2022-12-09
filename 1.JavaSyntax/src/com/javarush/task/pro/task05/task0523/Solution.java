package com.javarush.task.pro.task05.task0523;

/* 
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        for (int coordinate : coordinates) {
            if (coordinate % 2 == 0)
                evenSum += coordinate;
            else
                oddSum += coordinate;
        }
        System.out.println("("+oddSum+";"+evenSum+")");
    }
}
