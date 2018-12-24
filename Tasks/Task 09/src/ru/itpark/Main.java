package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charArray[] = scanner.nextLine().toCharArray();
        int resultNum = 0;
        int digit = 1;

        System.out.println("The char array:");

        for (int i = 0; i < charArray.length; i++) {
            int[] resultCharArray = new int[charArray.length];
            resultCharArray[i] = charArray[i] - '0';
            System.out.println("resultCharArray[" + i + "] = " + resultCharArray[i]);
        }

        System.out.println();

        for (int i = charArray.length - 1; i >= 0; i--) {
            resultNum += (charArray[i] - '0') * digit;
            digit *= 10;
        }

        System.out.println("The char array converted to an integer number");
        System.out.println("" + resultNum);

    }
}