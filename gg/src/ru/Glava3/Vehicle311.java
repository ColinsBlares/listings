package ru.Glava3;

class Vehicle311 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle311(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.setWheels(wheels);
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

    int getWheels(){
        return this.wheels;
    }
    void setWheels(int wheels){
        if ((wheels < 1) || (wheels > 24)){
            System.out.println("Неверно указано число колёс");
            return;
        }
        this.wheels = wheels;
    }
}
class VehicleGetSetMethod {
    public static void main(String[] args) {
        Vehicle311 ferrari = new Vehicle311(2, -2,360,12);
        System.out.println("Max скорость: " + ferrari.getMaxSpeed() + " км/ч ");
        System.out.println("Число колёс: "+ ferrari.getWheels());
        ferrari.setWheels(4);
        System.out.println("Число колёс (повторно): " + ferrari.getWheels());
    }
}
