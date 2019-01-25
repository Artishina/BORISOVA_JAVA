package ru.itpark;

class Bicycle extends Vehicle implements Driving {

    Bicycle(int number) {
        super(number);
    }


    @Override
    public String drive() {
        return " Велосипед едет";
    }

}
