package ru.itpark;

public class Main {

    public static void main(String[] args) {
        StepArray stepArray = new StepArray(5);
        stepArray.fillArrayLines();
        stepArray.fillArray();
        stepArray.printArray();
    }
}
