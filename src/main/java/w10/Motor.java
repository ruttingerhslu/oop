package w10;

public class Motor implements Switchable {
    private boolean status;
    private int rotationalSpeed;

    public void switchOn() {
        status = true;
    }

    public void switchOff() {
        status = false;
    }

    public boolean isSwitchedOn() {
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
}