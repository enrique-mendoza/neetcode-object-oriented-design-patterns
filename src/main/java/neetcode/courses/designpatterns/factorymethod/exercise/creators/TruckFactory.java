package neetcode.courses.designpatterns.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.factorymethod.exercise.products.Truck;
import neetcode.courses.designpatterns.factorymethod.exercise.products.Vehicle;

public class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}
