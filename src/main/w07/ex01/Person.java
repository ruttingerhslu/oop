package src.main.w07.ex01;

import java.util.Objects;

public class Person {
    private final long id;
    private String firstName;
    private String lastName;

    /**
     * Create new Person with id, first and last name
     * @param id            personal id
     * @param firstName     the first name of the person
     * @param lastName      the last name of the person
     */
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() +
                "\nLast name: " + getLastName();
    }
}
