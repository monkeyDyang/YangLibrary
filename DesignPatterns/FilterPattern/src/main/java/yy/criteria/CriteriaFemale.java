package yy.criteria;

import yy.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : list)
        {
            if (person.getGender().equalsIgnoreCase("FEMALE"))
                femalePersons.add(person);
        }
        return femalePersons;
    }
}
