package neetcode.courses.designpatterns.factory.exercise.creators;

import neetcode.courses.designpatterns.factory.exercise.products.Truck;
import neetcode.courses.designpatterns.factory.exercise.products.Vehicle;

public class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}
