package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

public class Main {
    public static void main(String[] args) {
        /*DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("bucha1167");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/my_service");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);*/

        ApplicationContext context = new ClassPathXmlApplicationContext("ru.itpark.config/context.xml");
        UsersRepository usersRepository = context.getBean(UsersRepository.class);


        System.out.println(usersRepository.findAll());
        System.out.println(usersRepository.findOneByLogin("marsel"));
        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель","Сидиков"));

        //User user = new User("Ксюша", "Якушева","kseina","qwerty011");

        User user = User.builder()
                .firstName("Муса")
                .lastName("Джалил")
                .login("musa777")
                .passwordHash("хаерле ирте")
                .build();

        //usersRepository.save(user);

        System.out.println(usersRepository.findAll());
    }
}
