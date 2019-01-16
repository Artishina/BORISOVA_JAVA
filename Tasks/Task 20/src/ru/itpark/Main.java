package ru.itpark;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];

        int row = 0, col = 0;
        int dx = 1;
        int dy = 0;
        int directionChanges = 0;
        int steps = n;

        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--steps == 0) {
                steps = n * (directionChanges % 2) + n * ((directionChanges + 1) % 2) - (directionChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                directionChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
