import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class CountryAnalyzerTest {
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
                175);

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
     * check result
     */
    @Test
    void analyze() {
        CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
        countryAnalyzer.setPersons(persons);
        countryAnalyzer.analyze();
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("AUT",2);
        expected.put("ZA",2);
        Assertions.assertEquals(expected, countryAnalyzer.getResult());
    }
}