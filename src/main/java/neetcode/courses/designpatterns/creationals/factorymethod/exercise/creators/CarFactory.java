package neetcode.courses.designpatterns.creationals.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Car;
import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
