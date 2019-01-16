package ru.itpark;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.scanElements();
        matrix.printMatrix();
        matrix.matrixDiagonal();
        matrix.printMatrix();

    }
}
