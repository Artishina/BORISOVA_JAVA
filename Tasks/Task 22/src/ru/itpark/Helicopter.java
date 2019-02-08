package ru.itpark;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(int number) {
        super(number);
    }


    @Override
    public String fly() {
        return " Вертолет летит";
    }
}
