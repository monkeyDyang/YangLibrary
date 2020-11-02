package yy.criteria;

import yy.person.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> list);
}
