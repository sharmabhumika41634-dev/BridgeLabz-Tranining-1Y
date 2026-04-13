package com.gla.GenericProblemSlolve;
import java.util.*;

public class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    void addVehicle(T v) {
        fleet.add(v);
    }

    void showFleet() {
        for (T v : fleet) {
            System.out.println(v.getClass().getSimpleName());
        }
    }
}
