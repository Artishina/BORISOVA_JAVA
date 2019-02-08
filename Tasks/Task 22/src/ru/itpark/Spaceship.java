package ru.itpark;

public class Spaceship extends Vehicle implements Shooting, Flyable {

    public Spaceship(int number) {
        super(number);
    }

    @Override
    public String fly() {
        return " Космический корабль летит";
    }

    @Override
    public String shoot() {
        return " Космический корабль стреляет";
    }
}
