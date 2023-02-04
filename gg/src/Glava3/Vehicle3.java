package Glava3;
class Vehicle3 {
    int passegers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пройденный путь, равный " + value + "км.");
    }
}
class  VehicleMethodDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passangers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle bus = new Vehicle();
        bus.passangers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;

        System.out.print("автомобиль c " + car.passangers + " пассажирами");
        car.distance(time);
        System.out.print("автобус с " + bus.passangers + " пассажирами");
        bus.distance(time);

    }
}
