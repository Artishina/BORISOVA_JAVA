package ru.itpark;

class ParkingLot {
    private final static int MAX_PARKING_SIZE = 9;

    private int[] numbers = {1111, 1112, 1113, 1114, 1115, 1116, 1117, 1118, 1119};
    private static int count;
    private static int leftParkingSlots = MAX_PARKING_SIZE;
    private  static  int[] parkingSlots = new int[MAX_PARKING_SIZE];

    private static ParkingLot parkingLot;

    private ParkingLot() {

    }

    static {
        parkingLot = new ParkingLot();
    }

    private boolean getIsFull() {
        if (count == MAX_PARKING_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    private int[] getNumbers() {
        return numbers;
    }

    private boolean contains(int number) {
        for (int i = 0; i < getNumbers().length; i++) {
            if (getNumbers()[i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isTaken(int number) {
        for (int i = 0; i < parkingSlots.length; i++) {
            if (parkingSlots[i] == number) {
                return true;
            }
        }
        return false;
    }

    static void checkIfFull() {
        if (parkingLot.getIsFull()) {
            System.out.println("Парковка заполнена. Мест больше нет");
        } else {
            if (leftParkingSlots == 1) {
                System.out.println("На парковке еще есть " + leftParkingSlots + " место.");
            } else if (leftParkingSlots == 2 || leftParkingSlots == 3 || leftParkingSlots == 4) {
                System.out.println("На парковке еще есть " + leftParkingSlots + " места.");
            } else {
                System.out.println("На парковке еще есть " + leftParkingSlots + " мест.");
            }
        }
        System.out.println();
    }

    private void add(int number) {
        count++;
        parkingSlots[count] = number;
        leftParkingSlots = MAX_PARKING_SIZE - count;
    }

    private void remove() {
        count--;
        leftParkingSlots = MAX_PARKING_SIZE - count;
    }

    static void park(Vehicle vehicle) {
        if (!vehicle.getIsParked() && !parkingLot.getIsFull()) {
            if (parkingLot.contains(vehicle.getVehicleNum()) && !parkingLot.isTaken(vehicle.getVehicleNum())) {
                System.out.print("Доступ по гос. номеру #" + vehicle.getVehicleNum() + " получен. ");
                parkingLot.add(vehicle.getVehicleNum());
                vehicle.setIsParked(true);
                System.out.println("Транспорт с гос. номером #" + vehicle.getVehicleNum() + " припаркован");

            } else {
                System.out.println("В доступе по данному номеру отказано. Некорректный номер или повторяющийся гос. номер");
            }
        } else {
            System.out.println("В парковке отказано. Возможно, транспорт уже припаркован или на стоянке нет свободных мест");
        }
    }

    static void parkFew(Vehicle[] vehicles) {
        System.out.println();
        System.out.println("Парковка транспорта...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print((i + 1) + ": ");
            park(vehicles[i]);
        }
        System.out.println();
    }

    static void unpark(Vehicle vehicle) {
        if (vehicle.getIsParked()) {
            parkingLot.remove();
            vehicle.setIsParked(false);
            System.out.println("Транспорт с гос. номером #" + vehicle.getVehicleNum() + " выехал с парковки");
        } else {
            System.out.println("Такого транспорта нет на парковке");
        }
    }

    static void unparkFew(Vehicle[] vehicles) {
        System.out.println();
        System.out.println("Выезд с парковки...");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print((i + 1) + ": ");
            unpark(vehicles[i]);
        }
        System.out.println();
    }
}