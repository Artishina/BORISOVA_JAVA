package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Remote remote = new Remote();

        remote.TurnOn();

        remote.changeChannel(7);
        remote.changeProgram(1);
        remote.changeProgram(9);
        remote.checkCurrentStatus();
        remote.changeChannel(3);
        remote.checkCurrentStatus();

        remote.TurnOff();
        remote.TurnOff();
    }
}
