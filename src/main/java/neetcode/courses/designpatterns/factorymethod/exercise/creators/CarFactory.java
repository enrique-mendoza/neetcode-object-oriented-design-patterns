package neetcode.courses.designpatterns.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.factorymethod.exercise.products.Car;
import neetcode.courses.designpatterns.factorymethod.exercise.products.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
