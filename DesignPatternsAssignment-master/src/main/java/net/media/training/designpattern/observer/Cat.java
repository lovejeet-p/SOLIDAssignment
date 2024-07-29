package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 10:13:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cat implements Observer {
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    private Subject sun;

    public Cat() {
    }
    public Cat(Subject sun) {
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
