package ru.itpark;

class TV {
    private Channel[] channels;
    private static int count;

    TV(int n) {
        channels = new Channel[n];
        count = 0;
    }

    void showChannel(int channelNumber) {
        channels[channelNumber - 1].show();
    }

    void addChannel(Channel channel) {
        channels[count] = channel;
        count++;
    }
}
