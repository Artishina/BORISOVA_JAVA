package ru.itpark;

import ru.itpark.List.GenericArrayList;
import ru.itpark.List.GenericList;
import ru.itpark.models.Car;
import ru.itpark.models.User;
import ru.itpark.repositories.CarsRepository;
import ru.itpark.repositories.CarsRepositoryImpl;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.UsersRepositoryImpl;
import ru.itpark.utils.IdGenerator;
import ru.itpark.utils.UserFromConsoleRetriever;

public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt", idGenerator);

//        User user = retriever.retrieveUser();
//        usersRepository.save(user);

        System.out.println(usersRepository.find(0));
        System.out.println(usersRepository.find(1));
        System.out.println(usersRepository.find(2));

        System.out.println();

        IdGenerator carIdGenerator = new IdGenerator("cars_id_sequence.txt");

        Car car = new Car("toyota", 2);
        Car car1 = new Car("opel", 0);
        Car car2 = new Car("subaru", 1);
        Car car3 = new Car("Lada", 2);

        CarsRepository carsRepository = new CarsRepositoryImpl("cars.txt", carIdGenerator);
        carsRepository.save(car);
        carsRepository.save(car1);
        carsRepository.save(car2);
        carsRepository.save(car3);
        ((CarsRepositoryImpl) carsRepository).show();

        System.out.println(carsRepository.find(0));

        System.out.println("Список найденных машин по заданному id:");
        carsRepository.findByOwner((usersRepository).find(2)).print();


    }
}
