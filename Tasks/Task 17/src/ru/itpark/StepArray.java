package ru.itpark;

import java.util.*;

public class StepArray {
    int[][] array;
    Random random = new Random();

    public StepArray(int n) {
        array = new int[n][];
    }

    void fillArrayLines() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(10)];
        }
    }

    void fillArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
