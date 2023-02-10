package ru.Glava3;

class Vehicle310 {
    int passengers;
    int wheels;
    private int maxspeed;
    int burnup;

    Vehicle310(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = maxspeed * interval;
        return val;
    }
}
class VehicleAcessDemo{
    public static void main(String[] args) {
        Vehicle310 ferrari = new Vehicle310(2, 4, 360, 12);

        double distance = ferrari.distance(0.5);
        System.out.println(" Ferrari за пол часа проедет " + distance + " км");
        //System.out.println("Скорость Ferrari: "+ ferrari.maxspeed + "км/ч");
    }
}
