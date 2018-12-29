package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charArray[] = scanner.nextLine().toCharArray();

        System.out.println("The char array:");
        PrintArray(charArray);
        System.out.println();
        System.out.println("The char array converted to an integer number");
        System.out.println("" + ConvertToNumber(charArray));

    }

    public static void PrintArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("resultCharArray[" + i + "] = " + array[i]);
        }
    }

    public static int ConvertToNumber(char[] array) {
        int resultNum = 0;
        int digit = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            resultNum += (array[i] - '0') * digit;
            digit *= 10;
        }
        return resultNum;
    }
}