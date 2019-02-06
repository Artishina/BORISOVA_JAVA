package ru.itpark;

public class Node<N> {
    private N value;
    private Node next;

    Node(N value) {
        this.value = value;
        this.next = null;
    }

    N getValue() {
        return value;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
