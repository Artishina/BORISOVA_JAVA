package ru.itpark;

import java.util.Random;

class Channel {
    private Program[] programmes;
    private Random random = new Random();
    private int programmesCount;
    private static int count;

    private int getProgrammesCount() {
        return programmesCount;
    }

    private void setProgrammesCount(int programmesCount) {
        this.programmesCount = programmesCount;
    }

    Channel(int n) {
        setProgrammesCount(n);
        programmes = new Program[getProgrammesCount()];
        count = 0;
    }

    void show() {
        programmes[random.nextInt((getProgrammesCount()))].printShowTitle();
    }

    void addProgram(Program program) {
        programmes[count] = program;
        count++;
    }
}
