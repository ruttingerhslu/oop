package w10.ex01;
/**
 * 
 * Interface class representing a switchable thing.
 * 
 */

public interface Switchable {

    /**
     * Switch status to on.
     */
    void switchOn();

    /**
     * Switch status to off.
     */
    void switchOff();

    /**
     * @return {@code true} if switched on, else {@code false}.
     */
    boolean isSwitchedOn();

    /**
     * @return {@code true} if switched off, else {@code false}.
     */
    boolean isSwitchedOff();
}
