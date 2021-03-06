package ru.itpark;

public interface GenericList<V> extends Iterable<V> {
    void addToEnd(V value);

    void addToBeginning(V value);

    V get(int index);

    void insert(V value, int index);

    void remove(int index);

    void reverse();

    int getCount();

    boolean contains(V value);

    int indexOf(V value);

    void print();
}
