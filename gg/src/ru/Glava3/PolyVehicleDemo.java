package ru.Glava3;
class Vehicle2{
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle2(int passengers, int wheels, int maxspeed, int burnup){
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
class Auto2 extends Vehicle2 {
    boolean sunroof;

    Auto2(boolean sunroof){
        this(4, 4,200,12, sunroof);
    }
    Auto2(int f, int g, int h, int j, boolean sunroof){
        super (f, g, h, j);
        this.sunroof = sunroof;
    }
}
class PolyVehicleDemo {
    public static void main(String[] args) {
        Auto2 a = new Auto2(true);
        Vehicle2 v = new Vehicle2(4,4,160,13);

        Vehicle2 [] pvd = {a, v};

        for (int i = 0; i<pvd.length; i++){
            System.out.println(pvd[i].toString());
        }
    }
}
