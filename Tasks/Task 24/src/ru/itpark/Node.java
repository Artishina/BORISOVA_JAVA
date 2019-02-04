package ru.itpark;

class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    int getValue() {
        return value;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
