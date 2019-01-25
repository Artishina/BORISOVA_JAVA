package ru.itpark;

class Car extends Vehicle implements Driving {

    Car(int number) {
        super(number);
    }

    @Override
    public String drive() {
        return " Машина едет";
    }
}
