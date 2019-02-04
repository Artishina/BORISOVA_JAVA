package ru.itpark;

interface IntegerList {
    void addToEnd(int value);

    void addToBeginning(int value);

    int get(int index);

    void insert(int value, int index);

    void remove(int index);

    void reverse();

    int getCount();

    void sort();

    boolean contains(int value);

    int indexOf(int value);
}
