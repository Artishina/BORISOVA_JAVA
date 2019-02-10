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
        System.out.println("GenericLinkedStringList:");

        GenericLinkedList<String> stringLinkedList = new GenericLinkedList<>();
        stringLinkedList.addToEnd("c");
        stringLinkedList.addToBeginning("b");
        stringLinkedList.addToBeginning("a");

        stringLinkedList.print();
        System.out.println(stringLinkedList.getCount());

        stringLinkedList.reverse();
        stringLinkedList.print();

        System.out.println(stringLinkedList.contains("a"));
        System.out.println(stringLinkedList.indexOf("b"));

        stringLinkedList.remove(1);
        stringLinkedList.print();

        stringLinkedList.insert("l", 1);
        stringLinkedList.insert("k", 2);
        stringLinkedList.print();

        System.out.println();
        System.out.println("GenericLinkedIntegerList:");

        GenericLinkedList<Integer> integerLinkedList = new GenericLinkedList<>();
        integerLinkedList.addToEnd(5);
        integerLinkedList.addToBeginning(1);
        System.out.println(integerLinkedList.get(0));

        integerLinkedList.print();

        System.out.println(integerLinkedList.indexOf(1));

        System.out.println(integerLinkedList.contains(5));

        integerLinkedList.reverse();
        integerLinkedList.print();

        System.out.println(integerLinkedList.getCount());

        integerLinkedList.addToBeginning(8);
        integerLinkedList.print();
        System.out.println(integerLinkedList.getCount());

        integerLinkedList.remove(1);
        integerLinkedList.print();

        integerLinkedList.insert(22,1);
        integerLinkedList.print();

        System.out.println();

        integerLinkedList.insert(11,2);
        integerLinkedList.print();

        System.out.println(stringLinkedList.getCount());

        integerLinkedList.insert(111, 3);
        integerLinkedList.print();

        System.out.println();
        System.out.println("IntegerLinkedListIterator:");

        Iterator<Integer> intIterator = integerLinkedList.iterator();

        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println();
        System.out.println("StringLinkedListIterator:");

        Iterator<String> stringIterator = stringLinkedList.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println();
        System.out.println("IntegerArrayListIterator:");

        Iterator<Integer> intArrayIterator = integerList.iterator();

        while (intArrayIterator.hasNext()) {
            System.out.println(intArrayIterator.next());
        }

        System.out.println();
        System.out.println("StringArrayListIterator:");

        Iterator<String> stringArrayIterator = stringList.iterator();

        while (stringArrayIterator.hasNext()) {
            System.out.println(stringArrayIterator.next());
        }
    }
}
