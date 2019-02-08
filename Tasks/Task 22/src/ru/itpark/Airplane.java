package ru.itpark;

public class Airplane extends Vehicle implements Flyable {

    public Airplane(int number) {
        super(number);
    }

    @Override
    public String fly() {
        return " Самолет летит";
    }
}
