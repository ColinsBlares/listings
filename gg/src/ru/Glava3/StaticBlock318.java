package ru.Glava3;

class StaticBlock318 {
    static double rootOf9;
    static double rootOf27;
    int number;

    static {
        System.out.println("Инициализация статических членов класса...");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock318(int number){
        System.out.println("Инициализация переменных экземпляра класса...");
        this.number = number;
    }
}
class StaticBlockDemo{
    public static void main(String[] args) {
        System.out.println("Корень из 9 равен " + StaticBlock318.rootOf9);
        System.out.println("Корень из 27 равен " + StaticBlock318.rootOf27);
        StaticBlock318 sb1 = new StaticBlock318(4);
        System.out.println("sb1.number = " + sb1.number);
        StaticBlock318 sb2 = new StaticBlock318(16);
        System.out.println("sb2.number = " + sb2.number);
    }
}