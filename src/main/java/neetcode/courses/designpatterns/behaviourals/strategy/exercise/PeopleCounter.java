package neetcode.courses.designpatterns.behaviourals.strategy.exercise;

import neetcode.courses.designpatterns.behaviourals.strategy.exercise.context.Person;
import neetcode.courses.designpatterns.behaviourals.strategy.exercise.strategies.PersonFilter;

import java.util.List;

public class PeopleCounter {

    private PersonFilter filter;

    public void setFilter(PersonFilter filter) {
        this.filter = filter;
    }

    public int count(List<Person> people) {
        int count = 0;

        for (Person person : people) {
            if (this.filter.apply(person)) {
                count++;
            }
        }

        return count;
    }
}
