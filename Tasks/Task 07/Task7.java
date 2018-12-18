import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int localMaximaCount = 0;

        System.out.println("The array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println();

        for (int i = 1; i < array.length - 1; i++) {

            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                localMaximaCount++;
            }
        }

        System.out.println("The number of local maxima = " + localMaximaCount);
    }
}