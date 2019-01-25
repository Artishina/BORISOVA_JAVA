package ru.itpark;

class Helicopter extends Vehicle implements Flyable {

    Helicopter(int number) {
        super(number);
    }


    @Override
    public String fly() {
        return " Вертолет летит";
    }
}
