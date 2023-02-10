package ru.Glava3;

interface A {
    void metodA();
}

interface B extends A{
    void metodB();
}
class IExample implements B{
    public void metodA() {System.out.println("Метрод А");}
    public void metodB() {System.out.println("Метод В");}
}

public class IExampleDemo{
    public static void main(String[] args) {
        IExample ie = new IExample();
        ie.metodA();
        ie.metodB();
    }
}
