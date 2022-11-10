package src.main.w07.ex01;

import java.util.Objects;

public class Person implements Comparable<Person> {
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

    @Override
    public final int hashCode() {
        return Objects.hash(getId());
    }

    /*
     * Returns zero if first and last name are the same, returns
     * negative integer if this person's first and last name are lexicographically less than the provided person
     * and positive integer if this person's first and last name are lexicographically less than the provided person.
     * @param person {@link Person} to be compared to
     * @return      negative integer, zero or positive integer.
     */
    @Override
    public int compareTo(Person person) {
        if (!person.getLastName().equals(this.getLastName())) {
            return person.getLastName().compareTo(this.getLastName());
        } else {
            return person.getFirstName().compareTo(this.getFirstName());
        }
    }
}
