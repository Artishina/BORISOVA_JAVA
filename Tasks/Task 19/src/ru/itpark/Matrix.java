package ru.itpark;

import java.util.*;

public class Matrix {
    int[][] matrix;

    public Matrix(int n) {
        matrix = new int[n][n];
    }

    void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void matrixDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && i < j) {
                    matrix[i][j] *= 2;
                } else if (i != j && i > j) {
                    matrix[i][j] /= 2;
                }
            }
        }
    }

    void scanElements() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
