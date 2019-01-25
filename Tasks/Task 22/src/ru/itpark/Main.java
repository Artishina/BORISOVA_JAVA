package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1111);
        Helicopter helicopter = new Helicopter(1112);
        Airplane airplane = new Airplane(111);
        Tank tank = new Tank(1114);
        Spaceship spaceship = new Spaceship(1115);
        Bicycle bicycle = new Bicycle(1116);

        ParkingLot.park(car);
        car.checkIfParked();

        Vehicle[] vehicles = {car, helicopter, airplane, tank, spaceship, bicycle};

        Driving[] drivingVehicles = {car, tank, bicycle};
        Flyable[] flyableVehicles = {helicopter, spaceship, airplane};
        Shooting[] shootingsVehicles = {tank, spaceship};

        ParkingLot.parkFew(vehicles);
        ParkingLot.park(car);

        ParkingLot.checkIfFull();

        ParkingLot.park((Vehicle)drivingVehicles[0]);

        Vehicle.shootFew(shootingsVehicles);
        Vehicle.flyFew(flyableVehicles);

        ParkingLot.unpark(car);
        car.checkIfParked();


        Car car2 = new Car(1111);
        ParkingLot.unpark(car2);

        ParkingLot.park(car2);
    }
}