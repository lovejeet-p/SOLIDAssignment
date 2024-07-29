package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory {
    public MotherBoard createMotherBoard() {
        return new AndroidMotherBoard();
    }

    public Processor createProcessor() {
        return new AndroidProcessor();
    }

    public Screen createScreen() {
        return new AndroidScreen();
    }

    public Case createCase() {
        return new AndroidCase();
    }

    public Battery createBattery() {
        return new Battery();
    }
}
