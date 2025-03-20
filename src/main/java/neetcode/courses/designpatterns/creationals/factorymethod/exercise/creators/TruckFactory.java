package neetcode.courses.designpatterns.creationals.factorymethod.exercise.creators;

import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Truck;
import neetcode.courses.designpatterns.creationals.factorymethod.exercise.products.Vehicle;

public class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}
