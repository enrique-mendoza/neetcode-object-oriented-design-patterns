package neetcode.courses.designpatterns.behaviourals.strategy.exercise.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.exercise.context.Person;
import neetcode.courses.designpatterns.behaviourals.strategy.exercise.strategies.PersonFilter;

public class MarriedFilter implements PersonFilter {

    @Override
    public boolean apply(Person person) {
        return person.isMarried();
    }
}
