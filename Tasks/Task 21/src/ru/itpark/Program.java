package ru.itpark;

class Program {
    private String showTitle;

    Program(String showTitle) {
        this.showTitle = showTitle;
    }

    void printShowTitle() {
        System.out.println("Идет " + showTitle);
    }
}
