package ru.itpark.utils;

import ru.itpark.models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {
    private Scanner scanner;

    public UserFromConsoleRetriever() {
        this.scanner = new Scanner(System.in);
    }

    public User retrieveUser() {
        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        return new User(name, surname);
    }
}
