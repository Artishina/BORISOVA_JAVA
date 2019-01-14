package ru.itpark;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);

        list.add(6);
        list.add(7);
        list.print();
        list.addToBegin(9);
        list.addToBegin(11);
        list.print();
        System.out.println(list.get(2));
        System.out.println(list.get(6));
        list.insert(22, 1);
        list.insert(33, 6);
        list.print();
        System.out.println(list.getCount());
        System.out.println(list.indexOf(6));
        System.out.println(list.indexOf(111));
        list.sort();
        list.print();
        list.reverse();
        list.print();

        if (list.contains(22)) {
            System.out.println("Array contains this element");
        } else {
            System.out.println("Array doesn't contain this element");
        }
    }
}
