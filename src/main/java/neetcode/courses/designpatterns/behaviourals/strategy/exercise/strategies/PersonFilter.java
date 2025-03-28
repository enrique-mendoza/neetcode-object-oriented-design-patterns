package neetcode.courses.designpatterns.behaviourals.strategy.exercise.strategies;

import neetcode.courses.designpatterns.behaviourals.strategy.exercise.context.Person;

public interface PersonFilter {

    boolean apply(Person person);
}
