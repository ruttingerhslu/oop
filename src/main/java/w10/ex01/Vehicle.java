package w10.ex01;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Vehicle implements PropertyChangeListener {
    private final Motor motor = new Motor();
    private final Switchable radio = new Radio();

    public Vehicle() {
        radio.switchOn();
        motor.addPropertyChangeListener(this);
        motor.switchOn();
    }

    public boolean isMotorRunning() {
        return motor.isSwitchedOn();
    }

    public boolean isRadioOn() {
        return radio.isSwitchedOn();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        handleMotorEvent(evt);
    }

    private void handleMotorEvent(PropertyChangeEvent evt) {
        // HANDLE EVENT
    }
}