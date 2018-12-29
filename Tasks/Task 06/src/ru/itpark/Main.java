package ru.itpark;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};

        System.out.println("The source array:");
        PrintArray(array);
        System.out.println();
        ReverseArray(array);
        System.out.println("The destination array:");
        PrintArray(array);
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void ReverseArray(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }
}