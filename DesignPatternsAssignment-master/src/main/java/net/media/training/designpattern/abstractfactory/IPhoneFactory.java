package net.media.training.designpattern.abstractfactory;

public class IPhoneFactory implements PhoneFactory {
    public MotherBoard createMotherBoard() {
        return new IphoneMotherBoard();
    }

    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    public Screen createScreen() {
        return new IphoneScreen();
    }

    public Case createCase() {
        return new IphoneCase();
    }

    public Battery createBattery() {
        return new Battery();
    }
}
