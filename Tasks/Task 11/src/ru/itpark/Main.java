package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indexOfMin;
        int temp;
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

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

        System.out.println("The sorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Enter the number you are searching for");
        int num = scanner.nextInt();

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

        System.out.println("The index of " + array[middle] + " is " + middle);
    }
}
