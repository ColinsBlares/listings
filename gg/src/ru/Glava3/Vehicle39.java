package ru.Glava3;

class Vehicle39 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle39(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
