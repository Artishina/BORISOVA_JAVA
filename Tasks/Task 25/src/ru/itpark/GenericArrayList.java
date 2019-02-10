package ru.itpark;

public class GenericArrayList<T> implements GenericList<T> {
    private T[] elements;
    private int count;

    public GenericArrayList(int elementsLength) {
        elements = (T[]) new Object[elementsLength];
        this.count = 0;
    }

    @Override
    public void addToEnd(T value) {
        for (int i = elements.length - 1; i >= 1; i--) {
            if (elements[i] == null && elements[i - 1] != null) {
                elements[i] = value;
            } else if (elements[0] == null) {
                elements[0] = value;
                break;
            }
        }
    }

    @Override
    public void addToBeginning(T value) {
        for (int i = elements.length - 1; i >= 1; i--) {
            elements[i] = elements[i - 1];
        }
        elements[0] = value;
    }

    @Override
    public T get(int index) {
        if (index >= 0 || index < count) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void insert(T value, int index) {
        if (index >= 0 && index < elements.length) {
            for (int i = getCount() - 1; i > index; i--) {
                if (index > getCount()) {
                    addToEnd(value);
                } else {
                    elements[i] = elements[i - 1];
                }
            }
            elements[index] = value;
        } else {
            System.out.println("Array index out of bounds!");
        }
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < elements.length) {
            for (int i = index; i < getCount(); i++) {
                elements[i - 1] = elements[i];
            }
            elements[index] = null;
        } else {
            System.out.println("Array index out of bounds!");
        }
    }

    @Override
    public void reverse() {
        T temp;
        for (int i = 0, j = elements.length - 1; i < j; i++, j--) {
            temp = elements[j];
            elements[j] = elements[i];
            elements[i] = temp;
        }

    }

    @Override
    public int getCount() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public T show() {
        return elements[0];
    }

    private class GenericArrayListIterator implements Iterator<T> {
        T current;
        int i = 0;

        public GenericArrayListIterator() {
            this.current = elements[i];
        }

        @Override
        public boolean hasNext() {
            if (i < elements.length) {
                return true;
            } else {
                return  false;
            }
        }

        @Override
        public T next() {
            current = elements[i++];
            T value = current;
            return value;
        }
    }

    public Iterator<T> iterator() {
        return new GenericArrayListIterator();
    }
}
