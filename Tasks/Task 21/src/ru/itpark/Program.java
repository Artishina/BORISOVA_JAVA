package ru.itpark;

class Program {
    private String[] listOfProgrammes = {"Thomas & Friends", "House", "Adventure time", "Steven Universe", "What's New Scooby-Doo?",
            "News", "Go away Unicorn!", "Power rangers", "Kojak", "Mr Bean"};

    String[] getListOfProgrammes() {
        return listOfProgrammes;
    }

    int getNumberOfPrograms() {
        return listOfProgrammes.length;
    }
}
