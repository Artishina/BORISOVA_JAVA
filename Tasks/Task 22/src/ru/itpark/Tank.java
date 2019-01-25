package ru.itpark;

class Tank extends Vehicle implements Driving, Shooting {

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
