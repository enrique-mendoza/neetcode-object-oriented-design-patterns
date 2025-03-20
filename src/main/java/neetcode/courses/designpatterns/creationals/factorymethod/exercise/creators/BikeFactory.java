package neetcode.courses.designpatterns.creationals.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Bike;
import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Vehicle;

public class BikeFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}
