package src.main.w07.ex01;

import java.util.Objects;

public class Person {
    private final long id;
    private String firstName;
    private String lastName;

    /**
     * Create new Person with id, first and last name
     * @param id            personal identifier
     * @param firstName     the first name of a person
     * @param lastName      the last name of a person
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
        return getClass().getSimpleName() + "first name: " + getFirstName() +
                ", last name: " + getLastName();
    }

    @Override
    public final boolean equals(Object o) {
        if (o instanceof Person) {
            return this.getId() == ((Person)o).getId();
        }
        return false;
    }
}
