package ru.Glava3;

class Vehicle315 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;
    Vehicle315(){
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    Vehicle315(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
}
