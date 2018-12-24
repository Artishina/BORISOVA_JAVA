package ru.itpark;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] firstLine = scanner.nextLine().toCharArray();
        char[] secondLine = scanner.nextLine().toCharArray();

        int maxLength = firstLine.length - secondLine.length;

        for (int i = 0; i <= maxLength; i++) {
            if (firstLine[i] != secondLine[0]) {
                while (++i <= maxLength && firstLine[i] != secondLine[0]) ;
            }

            if (i <= maxLength) {
                int startOfTheLine = i + 1;
                int endOfTheLine = startOfTheLine + secondLine.length - 1;
                for (int j = 1; startOfTheLine < endOfTheLine && firstLine[startOfTheLine] == secondLine[j]; startOfTheLine++, j++){}


                if (startOfTheLine == endOfTheLine) {
                    System.out.println("Position = " + i);
                }
                else {
                    System.out.println("Try again!");
                }
            }
        }
    }
}