import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonManagerTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(
                "max",
                "mustermann",
                'W',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180
        );
    }

    @Test
    void addPerson() {
        /*
        PersonManager personManager = new PersonManager();
        personManager.addPerson(person);
        Assertions.assertEquals(person,personManager);
        */
    }
}