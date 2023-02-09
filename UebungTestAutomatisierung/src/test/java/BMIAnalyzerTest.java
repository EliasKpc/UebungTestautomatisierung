import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BMIAnalyzerTest {

    Person person;
    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person = new Person(
                "Fritz",
                "Fuchs",
                'M',
                24,
                "AUT",
                3200,
                "grün",
                62,
                170);


        persons.add(person);
    }

    @Test
    void calcBmi() {
        BMIAnalyzer testCalcBmi = new BMIAnalyzer();
        testCalcBmi.setPersons(persons);
        Assertions.assertEquals(21.453287197231834,testCalcBmi.calcBmi(person));
    }

    /**
     * check result
     */
    @Test
    void analyze() {
    }
}