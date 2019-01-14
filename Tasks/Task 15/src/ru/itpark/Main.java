package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = -3;
        array[1] = 4;
        PrintArray(array);
        PutToTheBeginningOfTheArray(array, 5);
        PrintArray(array);
        PutToTheEndOfTheArray(array, 8);
        PrintArray(array);
        PutToAPosition(array, 3, 22);
        PrintArray(array);
        DeleteFromAPosition(array,2);
        PrintArray(array);
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void PutToTheEndOfTheArray(int[] array, int num) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] == 0 && array[i - 1] != 0) {
                array[i] = num;
            } else if (array[0] == 0) {
                array[0] = num;
                break;
            }
        }
    }

    public static void PutToTheBeginningOfTheArray(int[] array, int num) {
        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = num;
    }

    public static void PutToAPosition(int[] array, int position, int num) {
        if (position != 0) {
            for (int i = array.length - 1; i >= position; i--) {
                array[i] = array[i - 1];
            }
        }
        else {
            PutToTheBeginningOfTheArray(array, num);
        }
        array[position] = num;
    }

    public static void DeleteFromAPosition(int[] array, int position) {
         for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
