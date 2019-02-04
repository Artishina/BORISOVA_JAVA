package ru.itpark;

public class GenericArrayList<T> {
    private T[] elements;
    private int count;

    public GenericArrayList() {
        elements = (T[]) new Object[10];
        this.count = 0;
    }

    public void add(T value) {
        elements[count] = value;
        count++;
    }

    public T get(int index) {
        if (index >=0 || index < count) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

}
