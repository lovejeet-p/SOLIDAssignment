package net.media.training.designpattern.observer;

public interface Subject {
    Boolean addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
