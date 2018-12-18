import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {3, 2, 10, 11, 15, -5, 6};
        int indexOfMin;
        int temp;

        System.out.println("The source array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            temp = array[indexOfMin];
            array[indexOfMin] = array[i];
            array[i] = temp;
        }

        System.out.println("The destination array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}