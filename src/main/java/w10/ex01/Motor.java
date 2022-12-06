package w10.ex01;

import w08.ex02.TemperatureTrend;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {
    private boolean status;
    private int rotationalSpeed;
    private List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public void switchOn() {
        status = true;
    }

    public void switchOff() {
        status = false;
    }

    public boolean isSwitchedOn() {
        PropertyChangeEvent evt = new PropertyChangeEvent(Motor.class, "status", 2, 3);
        this.firePropertyChangeEvent(evt);
        return status;
    }

    public boolean isSwitchedOff() {
        return !status;
    }
    
    public void setRotationalSpeed(int rpm) {
        rotationalSpeed = rpm;
        if (rpm == 0) switchOff();
        else switchOn();
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    void addPropertyChangeListener(final PropertyChangeListener listener) {
        if(listener != null) {
            this.changeListeners.add(listener);
        }
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (PropertyChangeListener listener : this.changeListeners) {
            listener.notify();
        }
    }
}