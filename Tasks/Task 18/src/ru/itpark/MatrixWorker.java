package ru.itpark;

import java.util.*;

class MatrixWorker {
    Random random = new Random();

    void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void multMatrix(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(mult(a, b)[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sumMatrix(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(sum(a, b)[i][j] + " ");
            }
            System.out.println();
        }
    }


    int[][] sum(int a[][], int b[][]) {
        int[][] sumMatrix = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumMatrix;
    }

    int[][] mult(int a[][], int b[][]) {
        int[][] multMatrix = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    multMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return multMatrix;
    }
}