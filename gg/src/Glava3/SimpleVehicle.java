package Glava3;
class SimpleVehicle {
    int passangers;
}
class RefTypes{
    public static void main(String[] args) {
        SimpleVehicle car1, car2;
        car1 = new SimpleVehicle();
        car1.passangers = 25;

        car2 = car1;
        System.out.println("Количество пассажиров car2 равно " + car2.passangers);
        car2.passangers = 50;

        System.out.println("Количество пассажиров car1 равно " + car1.passangers);
    }
}
