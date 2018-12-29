package ru.itpark;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 10, 11, 15, -5, 6};

        System.out.println("The source array:");
        PrintArray(array);

        SelectionSort(array);
        System.out.println();

        System.out.println("The destination array:");
        PrintArray(array);

    }

    public static void SelectionSort(int[] array) {
        int indexOfMin, temp;

        for (int i = 0; i < array.length - 1; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            temp = array[indexOfMin];
            array[indexOfMin] = array[i];
            array[i] = temp;
        }
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}