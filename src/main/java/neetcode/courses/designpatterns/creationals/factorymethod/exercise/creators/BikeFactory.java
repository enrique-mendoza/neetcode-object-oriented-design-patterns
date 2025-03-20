package neetcode.courses.designpatterns.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.factorymethod.exercise.products.Bike;
import neetcode.courses.designpatterns.factorymethod.exercise.products.Vehicle;

public class BikeFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}
