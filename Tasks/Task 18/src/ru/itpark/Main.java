package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 2;
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        MatrixWorker matrixWorker = new MatrixWorker();

        matrixWorker.fillMatrix(matrixA);
        matrixWorker.fillMatrix(matrixB);

        System.out.println("Matrix A:");
        matrixWorker.printMatrix(matrixA);
        System.out.println("Matrix B:");
        matrixWorker.printMatrix(matrixB);

        System.out.println("Sum:");

        matrixWorker.sumMatrix(matrixA, matrixB);

        System.out.println();
        System.out.println("Multiplication:");

        matrixWorker.multMatrix(matrixA, matrixB);
    }


}