package src.main.w04.ex02;
public class Radio implements Switchable {
    private boolean status;
    private double frequency;

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

    public void changeFrequency(double freq) {
        frequency = freq;
    }

    public double getFrequency() {
        return frequency;
    }
    
}
