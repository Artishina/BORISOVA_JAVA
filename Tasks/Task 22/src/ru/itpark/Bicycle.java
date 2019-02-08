package ru.itpark;

public class Bicycle extends Vehicle implements Drivable {

    public Bicycle(int number) {
        super(number);
    }


    @Override
    public String drive() {
        return " Велосипед едет";
    }

}
