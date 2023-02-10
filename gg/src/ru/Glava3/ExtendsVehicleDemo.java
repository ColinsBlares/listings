package ru.Glava3;
class Vehicle{
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle(){
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    double distance(double interval) {
        double val = maxspeed * interval;
        return val;
    }

    int getMaxSpeed(){
        return this.maxspeed;
    }
}
class Auto extends Vehicle{
    boolean sunroof;
}
public class ExtendsVehicleDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.sunroof = true;

        System.out.println("Путь пройденный за 1.5 часа " + bmw.distance(1.5)+ "км");
        System.out.println("Max скорость " + bmw.getMaxSpeed() + "км/ч");
        System.out.println("Наличие люка " + bmw.sunroof);

    }
}
