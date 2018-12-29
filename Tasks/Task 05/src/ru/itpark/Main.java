package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        FillArray(array);
        PrintArray(array);

        System.out.println();
        System.out.println("The maximum element is " + GetMaxElement(array));
        System.out.println("The minimum element is " + GetMinElement(array));
    }

    public static int GetMaxElement(int[] array) {
        int indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return array[indexOfMax];
    }

    public static int GetMinElement(int[] array) {
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return array[indexOfMin];
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
            array[i] = random.nextInt(100);
        }
    }
}

