package ru.itpark;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

        list.addToBeginning(3);
        list.addToBeginning(2);
        list.addToBeginning(1);

        list.addToEnd(4);
        list.addToEnd(5);
        list.addToEnd(6);

        list.print();

        System.out.println(list.get(4));

        list.insert(7, 2);

        list.print();

        System.out.println(list.get(2));

        System.out.println(list.getCount());

        list.remove(1);

        list.print();

        System.out.println(list.contains(1));
        System.out.println(list.indexOf(6));

        System.out.println("!");

        list.reverse();

        list.print();
    }
}
