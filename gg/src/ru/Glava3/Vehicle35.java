package ru.Glava3;

class Vehicle35 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance (double interval) {
        double value = maxspeed * interval;
        return value;
    }
}

class VehicleRetMetgod{
    public static void main(String[] args) {
        Vehicle35 car = new Vehicle35();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle35 bus = new Vehicle35();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("Автомобиль с " + car.passengers + " паассажирами ");
        System.out.println("пройдёт за полчаса путь " +distanceCar+ " км");
        System.out.print("Автобус с " +bus.passengers+ " пассажирами ");
        System.out.println("пройдёт за пол часа путь " +distanceBus+ " км ");
    }
}