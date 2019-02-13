package ru.itpark.repositories;

import ru.itpark.List.GenericList;
import ru.itpark.models.Car;
import ru.itpark.models.User;

public interface CarsRepository extends CrudRepository<Car> {
    GenericList<Car> findByOwner(User owner);
}
