package yy.criteria;

import yy.person.Person;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /* 去重拼接 */
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(list);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(list);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
