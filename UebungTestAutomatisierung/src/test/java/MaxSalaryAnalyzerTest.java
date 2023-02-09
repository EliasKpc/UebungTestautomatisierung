import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

class MaxSalaryAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;
    ArrayList<Person> persons = new ArrayList<Person>();

    @BeforeEach
    void setUp() {
        person1 = new Person("max", "mustermann",'M', 18,"AUT",2000,"grün",70,180);
        person2 = new Person("susi", "sorglos",'W', 18,"AUT",4000,"gelb",50,160);
        person3 = new Person("fritz", "ernst",'M', 19,"AUT",1800,"blau",80,190);

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);

    }
    /**
     * check personsWithHighestSalary
     */
    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();
        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(1, personsWithHighestSalary.size());
        Assertions.assertEquals(person2, personWithHighestSalary);
    }
}