package w07.ex01;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import w07.ex01.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    public final Person person = new Person(1, "Paul", "Ross");

    @Test
    void testId() {
        assertEquals(1, person.getId());
    }

    @Test
    void testFirstName() {
        assertEquals("Paul", person.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Ross", person.getLastName());
    }

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    public void testEquals() {
        Person samePerson = new Person(1, "Paul", "Ross");

        assertTrue(person.equals(samePerson));
    }

    @Test
    public void testEqualsTypo() {
        Person typoPerson = new Person(1, "Paul", "Toss");

        assertFalse(person.equals(typoPerson));
    }

    @Test
    public void testEqualsFalse() {
        Person otherPerson = new Person(2, "Anna", "Triss");

        assertFalse(person.equals(otherPerson));
    }

    @Test
    public void testHashCode() {
        Person samePerson = new Person (1, "Paul", "Ross");

        assertEquals(person.hashCode(), samePerson.hashCode());
    }

    @Test
    public void testComparableFirstName() {
        Person otherPerson = new Person (2, "Anna", "Ross");

        assertTrue(person.compareTo(otherPerson) < 0);
    }

    @Test
    public void testComparableLastName() {
        Person lastPerson = new Person(0, "Paul", "Zachary");

        assertTrue(person.compareTo(lastPerson) > 0);
    }

    @Test
    public void testComparableSame() {
        Person samePerson = new Person(1, "Paul", "Ross");

        assertEquals(person.compareTo(samePerson), 0);
    }
}