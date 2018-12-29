package ru.itpark;

public class Main {

    public static void main(String[] args) {
        int num = 137;
        System.out.println(ToBinary(num));
    }

    public static String ToBinary(int num) {
        int[] bit = new int[8];
        int[] bitRemainder = new int[8];

        bit[0] = num % 2;
        bitRemainder[0] = num / 2;

        for (int i = 1; i < bit.length; i++) {
            bit[i] = bitRemainder[i - 1] % 2;
            bitRemainder[i] = bitRemainder[i - 1] / 2;
        }

        return bit[7] + "" + bit[6] + "" + bit[5] + "" + bit[4] + "" + bit[3] + "" + bit[2] + "" + bit[1] + "" + bit[0];
    }
}
