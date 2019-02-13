package ru.itpark.repositories;

import ru.itpark.List.GenericArrayList;
import ru.itpark.List.GenericList;
import ru.itpark.List.Iterator;
import ru.itpark.models.Car;
import ru.itpark.models.User;
import ru.itpark.utils.IdGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CarsRepositoryImpl implements CarsRepository {
    private GenericArrayList<Car> carList;
    private IdGenerator idGenerator;
    private String fileName;
    private final int CAR_LIST_LENGTH = 10;
    private Iterator<Car> carIterator;

    public CarsRepositoryImpl(String fileName, IdGenerator idGenerator) {
        carList = new GenericArrayList<>(CAR_LIST_LENGTH);
        this.idGenerator = idGenerator;
        this.fileName = fileName;
        this.carIterator = carList.iterator();
    }

    @Override
    public void save(Car model) {
        carList.addToEnd(model);
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getModel() + " " + model.getOwnerId());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Car find(int id) {
        return carList.get(id);
    }

    @Override
    public GenericList<Car> findByOwner(User owner) {
        GenericArrayList<Car> newList = new GenericArrayList<>(CAR_LIST_LENGTH);
        Car car = carIterator.next();
        while (carIterator.hasNext() && car != null) {
            if (owner.getId() == car.getOwnerId()) {
                newList.addToEnd(car);
            } /*else {
                String e = "Владелец машины с таким id в списке не найден";
                throw new NullPointerException(e);
            }*/
            car = carIterator.next();
        }
        return newList;
    }

    public void show() {
        carList.print();
    }
}
