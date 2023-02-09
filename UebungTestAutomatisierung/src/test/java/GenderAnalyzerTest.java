import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GenderAnalyzerTest {
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person1 = new Person(
                "Max",
                "Mustermann",
                'M',
                21,
                "AUT",
                3000,
                "blau",
                80,
                176);

        person2 = new Person(
                "Fritz",
                "Fuchs",
                'M',
                24,
                "AUT",
                2400,
                "grün",
                62,
                170);

        person3 = new Person(
                "Susi",
                "Sorglos",
                'W',
                18,
                "ZA",
                2600,
                "braun",
                55,
                164);

        person4 = new Person(
                "Gerti",
                "Wunder",
                'W',
                38,
                "ZA",
                1900,
                "blau",
                69,
                178);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
    }

    /**
     * Test the result of avgM and avgW
     */
    @Test
    void analyze() {
        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
        genderAnalyzer.setPersons(persons);
        genderAnalyzer.analyze();
        Assertions.assertEquals(173, genderAnalyzer.getAvgM());
        Assertions.assertEquals(171, genderAnalyzer.getAvgW());
    }
}