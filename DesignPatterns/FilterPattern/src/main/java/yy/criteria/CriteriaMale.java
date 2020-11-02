package yy.criteria;

import yy.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : list)
        {
            if (person.getGender().equalsIgnoreCase("MALE"))
                malePersons.add(person);
        }
        return malePersons;
    }
}
