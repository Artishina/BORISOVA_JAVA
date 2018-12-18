import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        int temp;

        System.out.println("The source array:");

        for (int i = 0; i < array.length; i++) {

            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println();

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }

        System.out.println("The destination array:");

        for (int i = 0; i < array.length; i++) {

            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}