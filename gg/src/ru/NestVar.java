package ru;

public class NestVar {
    public static void main(String[] args) {
        int count=1;
        System.out.println("count =" + count);
        {
            //int count=2;
            System.out.println("Первый независивый блок: count = " + count);

            int n=3;
            System.out.println("Первый независимый блок: n = " + n);

        }
        {
            int n=5;
            System.out.println("Второй независмый блок: n = " + n);

        }
    }
}
