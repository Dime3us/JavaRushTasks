package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        int min = n;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if(array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
