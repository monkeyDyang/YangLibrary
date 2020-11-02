package yy.criteria;

import yy.person.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /* AND拼接 */
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(list);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
