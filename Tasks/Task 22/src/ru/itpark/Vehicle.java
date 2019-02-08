package ru.itpark;

public abstract class Vehicle {
    private boolean isParked;
    private int vehicleNum;


    public int getVehicleNum() {
        return vehicleNum;
    }

    public boolean getIsParked() {
        return isParked;
    }

    public void setIsParked(boolean isParked) {
        this.isParked = isParked;
    }

    public Vehicle(int number) {
        vehicleNum = number;
    }

    public void checkIfParked() {
        System.out.print("Проверка состояния транспорта... ");
        if (getIsParked()) {
            System.out.println("Транспорт припаркован");
        } else {
            System.out.println("Транспорт не припаркован");
        }
    }

    public void park() {
        ParkingLot.park(this);
    }

    public void unpark() {
        ParkingLot.unpark(this);
    }

    public static void shootFew(Shooting[] vehicles) {
        System.out.println("Стрелба...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].shoot());
        }
        System.out.println();
    }

    public static void driveFew(Drivable[] vehicles) {
        System.out.println("Езда...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].drive());
        }
        System.out.println();
    }

    public static void flyFew(Flyable[] vehicles) {
        System.out.println("Полет...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("#" + (i + 1) + vehicles[i].fly());
        }
        System.out.println();
    }
}
