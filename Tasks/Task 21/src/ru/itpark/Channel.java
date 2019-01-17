package ru.itpark;

class Channel {
    private final int numberOfChannels = 10;
    private int currentChannel;

    void setCurrentChannel(int currentChannel) {
        if (currentChannel > 0 && currentChannel <= getNumberOfChannels()) {
            this.currentChannel = currentChannel;
        } else {
            System.out.println("Такого канала нет!");
        }
    }

    private int getNumberOfChannels() {
        return numberOfChannels;
    }

    int getCurrentChannel() {
        return currentChannel;
    }
}
