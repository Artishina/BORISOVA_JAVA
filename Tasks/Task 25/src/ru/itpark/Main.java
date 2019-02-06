package ru.itpark;

public class Main {

    public static void main(String[] args) {
        System.out.println("GenericArrayIntegerList:");
        GenericArrayList<Integer> integerList = new GenericArrayList<>(10);
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
        System.out.println("GenericArrayStringList:");

        GenericArrayList<String> stringList = new GenericArrayList<>(10);
        stringList.addToEnd("a");
        stringList.addToEnd("b");
        stringList.addToEnd("c");
        stringList.insert("k",8);
        stringList.insert("l",9);

        stringList.print();

        stringList.remove(9);

        stringList.print();

        System.out.println();
        System.out.println("GenericLinkedList:");

        GenericLinkedList<Integer> integerLinkedList = new GenericLinkedList<>();
        integerLinkedList.addToEnd(5);
        integerLinkedList.addToBeginning(1);
        System.out.println(integerLinkedList.get(0));

        integerLinkedList.print();

        integerLinkedList.insert(11,2);
        integerLinkedList.print();

        System.out.println(integerLinkedList.indexOf(1));

        System.out.println(integerLinkedList.contains(5));

        integerLinkedList.reverse();
        integerLinkedList.print();

    }
}
