package neetcode.courses.designpatterns.factory.exercise.creators;

import neetcode.courses.designpatterns.factory.exercise.products.Car;
import neetcode.courses.designpatterns.factory.exercise.products.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
