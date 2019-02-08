package ru.itpark;

public class Car extends Vehicle implements Drivable {

    public Car(int number) {
        super(number);
    }

    @Override
    public String drive() {
        return " Машина едет";
    }
}
