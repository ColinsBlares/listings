package Glava3;

class Vehciel2 {
    int passangers;
    int wheels;
    int maxspeed;
    int burnup;
}

class MoreVehicleDemo{
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.passangers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle bus1 = new Vehicle();
        bus1.passangers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 может проехать за 1 час 25 минут расстояние в ");
        System.out.print(distanceCar + " км с " + car1.passangers);
        System.out.println(" пассажирами.");
        System.out.print("bus1 может проехать за 1 час 25 минут расстояние в ");
        System.out.print(distanceBus + " км с " + bus1.passangers);
        System.out.println("с пассажирами");
    }
}
