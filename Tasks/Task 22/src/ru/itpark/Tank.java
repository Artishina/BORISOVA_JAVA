package ru.itpark;

public class Tank extends Vehicle implements Drivable, Shooting {

    public Tank(int number) {
        super(number);
    }

    @Override
    public String drive() {
        return " Танк едет";
    }

    @Override
    public String shoot() {
        return " Танк стреляет";
    }
}
