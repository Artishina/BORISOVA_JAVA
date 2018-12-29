package ru.itpark;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        FillArray(array);
        PrintArray(array);

        System.out.println();
        System.out.println("The number of local maxima = " + GetLocalMaxima(array));
    }

    public static int GetLocalMaxima(int[] array) {
        int localMaximaCount = 0;
        for (int i = 1; i < array.length - 1; i++) {

            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                localMaximaCount++;
            }
        }
        return localMaximaCount;
    }

    public static void PrintArray(int[] array) {
        System.out.println("The array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void FillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}