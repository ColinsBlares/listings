package ru.Glava2;

public class HyppotDemo {
    public static void main(String[] args) {
        double cathetus1, cathetus2, hypot;

        cathetus1 = 3;
        cathetus2 = 4;

        hypot = Math.sqrt((cathetus1*cathetus2)+(cathetus2*cathetus1));

        System.out.println("Длина гипотенузы равна " + hypot);
    }
}
