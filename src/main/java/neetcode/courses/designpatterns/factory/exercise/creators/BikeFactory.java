package neetcode.courses.designpatterns.factory.exercise.creators;

import neetcode.courses.designpatterns.factory.exercise.products.Bike;
import neetcode.courses.designpatterns.factory.exercise.products.Vehicle;

public class BikeFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}
