package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:35:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Observer {
    private boolean feelingWarm;
    private boolean outdoors;
    private boolean feelingTired;
    private Subject sun;

    public Person() {
    }
    public Person(Subject sun) {
        this.sun = sun;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outdoors = true;
        if(this.sun != null) {
            this.update(this.sun.addObserver(this));
        }
    }

    public void goIndoors() {
        outdoors = false;
        if(this.sun != null) this.sun.removeObserver(this);
    }

    public boolean isOutdoors() {
        return outdoors;
    }

    public void notifySunRose() {
        if (outdoors)
            feelingWarm = true;
    }

    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }

    public void update(Boolean isUp) {
        if(isUp) {
            notifySunRose();
        }
        else {
            notifySunSet();
        }
    }
}
