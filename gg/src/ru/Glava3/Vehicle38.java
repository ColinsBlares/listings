package ru.Glava3;

class Vehicle38 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle38(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}

class VehicleConstrDemo{
    public static void main(String[] args) {
        Vehicle38 car = new Vehicle38(2, 4, 130, 30);
        Vehicle38 bus = new Vehicle38(45,4,120,25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers +" пассажирами " + "проедет за 1 час " + distanceCar + "км.");

        System.out.println("Автобус с " + bus.passengers + " пассажирами "+ "проедете за 1 час " + distanceBus +"км.");
    }
}
