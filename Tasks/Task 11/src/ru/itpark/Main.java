package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        SelectionSort(array);
        System.out.println("The sorted array:");
        PrintArray(array);
        System.out.println("Enter the number you are searching for");
        int num = scanner.nextInt();
        System.out.println(BinarySearch(n, num, array));
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

    public static String BinarySearch(int n, int num, int[] array) {
        int left = 0;
        int right = n - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (array[middle] < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return "The index of " + array[middle] + " is " + middle;
    }
}
