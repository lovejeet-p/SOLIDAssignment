package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean isUp;

    public Sun() {
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        this.isUp = false;
        notifyObservers();
    }

    public void rise() {
        this.isUp = true;
        notifyObservers();
    }

    public Boolean addObserver(Observer observer) {
        observers.add(observer);
        return this.isUp;
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.isUp);
        }
    }
}