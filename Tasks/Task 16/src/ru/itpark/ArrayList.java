package ru.itpark;

import java.util.*;

public class ArrayList {
    int[] array;

    public ArrayList(int n) {
        this.array = new int[n];
    }

    void add(int element) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] == 0 && array[i - 1] != 0) {
                array[i] = element;
            } else if (array[0] == 0) {
                array[0] = element;
                break;
            }
        }
    }

    void addToBegin(int element) {
        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
    }

    int get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else return -1;
    }

    void insert(int element, int index) {
        if (index >= 0 && index < array.length) {
            for (int i = getCount(); i > index; i--) {
                if (index > getCount()) {
                    add(element);
                } else {
                    array[i] = array[i - 1];
                }
            }
           array[index] = element;
        } else {
            System.out.println("Array index out of bounds!");
        }
    }

    void reverse() {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    int getCount() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    void sort() {
        int indexOfMin, temp;

        for (int i = 0; i < array.length - 1; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            temp = array[indexOfMin];
            array[indexOfMin] = array[i];
            array[i] = temp;
        }
    }

    boolean contains(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    int indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
