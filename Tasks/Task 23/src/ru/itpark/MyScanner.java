package ru.itpark;

import java.io.*;

class MyScanner {
    private FileInputStream fileName;

    private void setFileName(FileInputStream fileName) {
        this.fileName = fileName;
    }

    MyScanner(String fileName) {
        try {
            setFileName(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    void nextInt() {
        try {
            int letter = fileName.read();

            while (letter != -1) {
                System.out.print(letter - 48);
                letter = fileName.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
