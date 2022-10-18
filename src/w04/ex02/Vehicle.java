package src.w04.ex02;

public class Vehicle {
    private Switchable motor = new Motor();
    private Switchable radio = new Radio();

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