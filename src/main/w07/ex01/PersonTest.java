package src.main.w07.ex01;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
    void testSetFirstName() {
        person.setFirstName("Bob");

        assertEquals("Bob", person.getFirstName());
    }

    @Test
    void testSetLastName() {
        person.setLastName("Rudd");

        assertEquals("Rudd", person.getLastName());
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}