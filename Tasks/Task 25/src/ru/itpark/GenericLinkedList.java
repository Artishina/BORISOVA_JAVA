package ru.itpark;

public class GenericLinkedList<T> implements GenericList<T> {
    private Node<T> top;
    private Node<T> tail;
    private int count;

    public GenericLinkedList() {
        this.top = null;
        this.count = 0;
    }

    private static class Node<N> {
        N value;
        Node<N> next;

        Node(N value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void addToEnd(T value) {
        Node<T> node = new Node<T>(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    @Override
    public void addToBeginning(T value) {
        Node<T> node = new Node<T>(value);

        if (top == null) {
            tail = node;
        }
        node.next = top;
        count++;
        top = node;
    }

    @Override
    public T get(int index) {
        Node<T> current;

        if (index < 0 || index > count) {
            String exceptionMessage = "Получить значение элемента невозможно. Индекс вышел за пределы";
            throw new IndexOutOfBoundsException(exceptionMessage);
        }

        if (index == count - 1) {
            current = tail;
        } else {
            current = top;
            if (index > 0) {
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            }
        }
        return current.value;
    }

    @Override
    public void insert(T value, int index) {
        Node<T> node = new Node<T>(value);
        Node prev = top;

        if (index < 0 || index > count) {
            String exceptionMessage = "Вставить элемент невозможно. Индекс вышел за пределы";
            throw new IndexOutOfBoundsException(exceptionMessage);
        }

        if (index == count) {
            addToEnd(value);
        } else if (index == 0) {
            addToBeginning(value);
        } else {
            for (int i = 1; i <= index; i++) {
                if (i == index) {
                    node.next = prev.next;
                    prev.next = node;
                }
                prev = prev.next;
            }
        }
        count++;
    }

    @Override
    public void remove(int index) {
        Node<T> prev = top;

        if (index < 0 || index > count) {
            String exceptionMessage = "Удалить элемент невозможно. Индекс вышел за пределы";
            throw new IndexOutOfBoundsException(exceptionMessage);
        }

        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                prev.next = prev.next.next;
                count--;
            }
            prev = prev.next;
        }
    }

    @Override
    public void reverse() {
        Node<T> prev = null;
        Node<T> current = top;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean contains(T value) {
        Node<T> node = top;

        for (int i = 0; i < count; i++) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public int indexOf(T value) {
        Node<T> node = top;

        for (int i = 0; i < count; i++) {
            if (node.value == value) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    @Override
    public void print() {
        Node<T> node = top;
        System.out.print(node.value);
        for (int i = 0; i < count - 1; i++) {
            node = node.next;
            System.out.print(" " + node.value);
        }
        System.out.println();
    }

    private class GenericLinkedListIterator implements Iterator<T> {
        private Node<T> current;

        public GenericLinkedListIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }

    public Iterator<T> iterator() {
        return new GenericLinkedListIterator();
    }
}

