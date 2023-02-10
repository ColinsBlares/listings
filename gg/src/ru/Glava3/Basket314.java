package ru.Glava3;

class Basket314 {
    void pay(double money){
        System.out.println("Оплачено наличными " + money);
    }
    void pay(String cardNum) {
        System.out.println("Оплачено по кредитной карте #" + cardNum);
    }

    void pay (String accountNum, String bankCode) {
        System.out.println("Первелено на счёт#" + accountNum + " в банке " + bankCode);
    }
}
class BasketDemo{
    public static void main(String[] args) {
        Basket314 b1 = new Basket314();
        Basket314 b2 = new Basket314();
        Basket314 b3 = new Basket314();

        System.out.println("b1: ");
        b1.pay(1200.0);
        System.out.println("b2: ");
        b2.pay(12345689);
        System.out.println("b3: ");
        b3.pay("987654321", "5500");
    }
}