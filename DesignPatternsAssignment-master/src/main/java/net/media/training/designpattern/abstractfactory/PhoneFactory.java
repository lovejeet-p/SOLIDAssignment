package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    public abstract MotherBoard createMotherBoard();

    public Battery createBattery();
    public abstract Processor createProcessor();
    public abstract Screen createScreen();
    public abstract Case createCase();
}
