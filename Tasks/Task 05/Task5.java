import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        System.out.println("The array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("array[" + i + "] = " + array[i]);
        }

        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
                
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println();
        System.out.println("The maximum element is " + array[indexOfMax]);
        System.out.println("The minimum element is " + array[indexOfMin]);
    }
}