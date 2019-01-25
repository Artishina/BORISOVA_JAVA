package ru.itpark;

abstract class Vehicle {
    private boolean isParked;
    private int vehicleNum;


    int getVehicleNum() {
        return vehicleNum;
    }

    boolean getIsParked() {
        return isParked;
    }

    void setIsParked(boolean isParked) {
        this.isParked = isParked;
    }

    Vehicle(int number) {
        vehicleNum = number;
    }

    void checkIfParked() {
        System.out.print("Проверка состояния транспорта... ");
        if (getIsParked()) {
            System.out.println("Транспорт припаркован");
        } else {
            System.out.println("Транспорт не припаркован");
        }
    }

    static void shootFew(Shooting[] vehicles) {
        System.out.println("Стрелба...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].shoot());
        }
        System.out.println();
    }

    static void driveFew(Driving[] vehicles) {
        System.out.println("Езда...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].drive());
        }
        System.out.println();
    }

    static void flyFew(Flyable[] vehicles) {
        System.out.println("Полет...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].fly());
        }
        System.out.println();
    }
}
