package ru.Glava3;
class Vehicle1{
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle1(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = maxspeed * interval;
        return val;
    }

    int getMaxSpeed(){
        return this.maxspeed;
    }

    public String toString(){
        return "Vehicle(passengers = " + passengers + ";" + "wheels = " + wheels + ";" + "maxspeed= " +maxspeed+";"+"burnup= "+ burnup + ")";
    }

}
class Auto1 extends Vehicle1 {
    boolean sunroof;

    Auto1(boolean sunroof){
        this(4, 4,200,12, sunroof);
    }
    Auto1(int f, int g, int h, int j, boolean sunroof){
        super (f, g, h, j);
        this.sunroof = sunroof;
    }
}
public class VehicleOverrideDemo320 {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1(2, 2, 100, 9);
        Auto1 a = new Auto1(2,4,180,12,true);
        System.out.println("Vehicle.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());
    }
}
