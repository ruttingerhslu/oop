package w10;

public class Vehicle {
    private final Switchable motor = new Motor();
    private final Switchable radio = new Radio();

    public Vehicle() {
        motor.switchOn();
        radio.switchOn();
    }

    public boolean isMotorRunning() {
        return motor.isSwitchedOn();
    }

    public boolean isRadioOn() {
        return radio.isSwitchedOn();
    }
}