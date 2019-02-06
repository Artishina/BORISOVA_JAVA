package ru.itpark;

public class Main {

    public static void main(String[] args) {
        GenericArrayList<Integer> integerList = new GenericArrayList<>();
        integerList.addToBeginning(1);
        integerList.addToBeginning(2);

        integerList.addToEnd(3);

        integerList.insert(5,8);
        integerList.insert(11,6);
        integerList.insert(22,4);

        integerList.print();
        System.out.println(integerList.getCount());

        integerList.remove(6);

        integerList.print();
        System.out.println(integerList.getCount());

        integerList.reverse();
        integerList.print();

        System.out.println();

        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.addToEnd("a");
        stringList.addToEnd("b");
        stringList.addToEnd("c");
        stringList.insert("k",8);
        stringList.insert("l",9);

        stringList.print();

        stringList.remove(9);

        stringList.print();

    }
}
