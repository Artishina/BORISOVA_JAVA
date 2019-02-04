package ru.itpark;

class IntegerLinkedList implements IntegerList {
    private Node top;
    private Node tail;
    private int count;

    IntegerLinkedList() {
        this.top = null;
        this.count = 0;
    }

    @Override
    public void addToEnd(int value) {
        Node node = new Node(value);

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
    public void addToBeginning(int value) {
        Node node = new Node(value);

        if (top == null) {
            tail = node;
        }
        node.setNext(top);
        count++;
        top = node;
    }

    @Override
    public int get(int index) {
        Node current;

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
    public void insert(int value, int index) {
        Node node = new Node(value);
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
        Node prev = top;

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
        Node prev = null;
        Node current = top;
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
    public void sort() {
        Node sorted = null;
        Node current = top;
        Node node;

        while (current != null) {
            Node next = current.getNext();
            if (sorted == null || sorted.getValue() >= current.getValue()) {
                current.setNext(sorted);
                sorted = current;
            } else {
                node = sorted;
                while (node.getNext() != null && node.getNext().getValue() < current.getValue()) {
                    node = node.getNext();
                }
                current.setNext(node.getNext());
                node.setNext(current);
            }
            current = next;
        }
        top = sorted;
    }

    @Override
    public boolean contains(int value) {
        Node node = top;

        for (int i = 0; i < count; i++) {
            if (node.getValue() == value) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(int value) {
        Node node = top;

        for (int i = 0; i < count; i++) {
            if (node.getValue() == value) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    void print() {
        Node node = top;
        System.out.print(node.getValue());
        for (int i = 0; i < count - 1; i++) {
            node = node.getNext();
            System.out.print(" " + node.getValue());
        }
        System.out.println();
    }
}
