package ru.itpark;

public class Main {

    static int[] fibArray;

    public static void main(String[] args) {
        int num = 10;
        fibArray = new int[num + 1];
        fibByRecMemo(num);

        System.out.println();
        System.out.println("result is " + fibArray[num]);
    }

    public static int fibByRecMemo(int num) {
        System.out.println("in fib with n = " + num);
        if (num == 0 || num == 1) {
            fibArray[num] = num;
            return num;
        }
        if (fibArray[num] == 0) {
            fibArray[num] = fibByRecMemo(num - 1) + fibByRecMemo(num - 2);
            System.out.println("out from fib with result = " + fibArray[num]);
            return fibArray[num];
        } else {
            return fibArray[num];
        }
    }
}
