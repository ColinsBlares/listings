package ru.Glava3;

class Vehciele2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}

class MoreVehicleDemo{
    public static void main(String[] args) {
        Vehciele2 car = new Vehciele2();
        car.passengers = 2;
        car.wheels = 6;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehciele2 bus = new Vehciele2();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 45;

        double interval = 1.25;
        double distanceCar = car.maxspeed * interval;
        double distanceBus = bus.maxspeed * interval;

        System.out.print("car1 может проехать за 1 час 25 минут расстояние в ");
        System.out.print(distanceCar + " км с " + car.passengers);
        System.out.println(" пассажирами.");
        System.out.print("bus1 может проехать за 1 час 25 минут расстояние в ");
        System.out.print(distanceBus + " км с " + bus.passengers);
        System.out.println("с пассажирами");
    }
}
