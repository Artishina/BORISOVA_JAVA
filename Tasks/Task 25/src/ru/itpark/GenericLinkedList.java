package ru.itpark;

public class GenericLinkedList<T> implements GenericList<T> {
    private Node<T> top;
    private Node<T> tail;
    private int count;

    public GenericLinkedList() {
        this.top = null;
        this.count = 0;
    }

    @Override
    public void addToEnd(T value) {
        Node<T> node = new Node<T>(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.setNext(node);
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
        node.setNext(top);
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
                    current = current.getNext();
                }
            }
        }
        return current.getValue();
    }

    @Override
    public void insert(T value, int index) {
        Node<T> node = new Node(value);
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
                    node.setNext(prev.getNext());
                    prev.setNext(node);
                }
                prev = prev.getNext();
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
                prev.setNext(prev.getNext().getNext());
                count--;
            }
            prev = prev.getNext();
        }
    }

    @Override
    public void reverse() {
        Node<T> prev = null;
        Node<T> current = top;
        while (current != null) {
            Node next = current.getNext();
            current.setNext(prev);
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
            if (node.getValue() == value) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(T value) {
        Node<T> node = top;

        for (int i = 0; i < count; i++) {
            if (node.getValue() == value) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    @Override
    public void print() {
        Node<T> node = top;
        System.out.print(node.getValue());
        for (int i = 0; i < count - 1; i++) {
            node = node.getNext();
            System.out.print(" " + node.getValue());
        }
        System.out.println();
    }
}
