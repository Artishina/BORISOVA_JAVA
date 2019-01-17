package ru.itpark;

class Remote {
    private Channel channel;
    private TV tv;
    private Program program;

    Remote() {
        channel = new Channel();
        tv = new TV();
        program = new Program();
    }

    void TurnOn() {
        if (tv.getIsOn()) {
            System.out.println("Телевизор уже включен");
        } else {
            tv.setIsOn(true);
            System.out.println("Вы включили телевизор");
            channel.setCurrentChannel(1);
        }
    }

    void TurnOff() {
        if (tv.getIsOn()) {
            tv.setIsOn(false);
            System.out.println("Вы выключили телевизор");
        } else {
            System.out.println("Телевизор уже выключен");
        }
    }

    void changeChannel(int n) {
        if (tv.getIsOn()) {
            System.out.println("Канал переключен на " + n + ". Идет передача " + program.getListOfProgrammes()[n]);
            channel.setCurrentChannel(n);
        }
    }

    void changeProgram(int n) {
        if (n > 0 && n < program.getNumberOfPrograms()) {
            channel.setCurrentChannel(n);
            System.out.println("Переключено на передачу " + program.getListOfProgrammes()[n] + " на канале " + n);
        } else {
            System.out.println("Нет такой передачи");
        }
    }

    void checkCurrentStatus() {
        System.out.println("Сейчас включен " + channel.getCurrentChannel() + " канал"
                + ". Идет передача " + program.getListOfProgrammes()[channel.getCurrentChannel()]);
    }
}
