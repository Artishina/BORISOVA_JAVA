package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Program program = new Program("Steven Universe");
        Program program1 = new Program("Adventure Time");
        Program program2 = new Program("Power Rangers");

        Program program3 = new Program("Thomas & Friends");
        Program program4 = new Program("What's New Scooby-Doo?");
        Program program5 = new Program("News");

        Channel channel = new Channel(3);
        channel.addProgram(program);
        channel.addProgram(program1);
        channel.addProgram(program2);
        channel.show();

        Channel channel1 = new Channel(3);
        channel1.addProgram(program3);
        channel1.addProgram(program4);
        channel1.addProgram(program5);
        channel1.show();


        TV tv = new TV(2);
        tv.addChannel(channel);
        tv.addChannel(channel1);
        tv.showChannel(2);


        Remote remote = new Remote();
        remote.pressButton(tv, 2);

    }
}
