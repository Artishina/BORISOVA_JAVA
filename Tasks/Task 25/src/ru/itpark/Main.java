package ru.itpark;

public class Main {

    public static void main(String[] args) {
        GenericArrayList<Integer> integerList = new GenericArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println(integerList.get(0));

        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        System.out.println(stringList.get(0));

    }
}
