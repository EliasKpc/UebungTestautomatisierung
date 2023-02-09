import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("max", "mustermann",'M', 18,"AUT",2000,"grün",70,180);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("max", person.getFirstname());
        Assertions.assertEquals("mustermann", person.getLastname());
        Assertions.assertEquals('M', person.getGender());
        Assertions.assertEquals(18, person.getAge());
        Assertions.assertEquals("AUT", person.getCountry());
        Assertions.assertEquals(2000, person.getSalary());
        Assertions.assertEquals("grün", person.getEyeColor());
        Assertions.assertEquals(70, person.getWeight());
        Assertions.assertEquals(180, person.getSize());
    }

    @Test
    void setEyeColor() {
        person.setEyeColor("grün");
        assertEquals("grün", person.getEyeColor());
    }
}