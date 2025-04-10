package neetcode.courses.designpatterns.behaviourals.strategy.exercise.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.exercise.context.Person;
import neetcode.courses.designpatterns.behaviourals.strategy.exercise.strategies.PersonFilter;

public class SeniorFilter implements PersonFilter {

    @Override
    public boolean apply(Person person) {
        return person.getAge() > 65;
    }
}
