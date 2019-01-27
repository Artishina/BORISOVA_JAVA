package ru.itpark;

class Remote {

    void pressButton(TV tv, int buttonNumber) {
        tv.showChannel(buttonNumber);
    }
}
