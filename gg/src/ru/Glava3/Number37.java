package ru.Glava3;
class Number37 {
    int x ;
    Number37(int num){
        x= num;
    }
}

class  NumberDemo{
    public static void main(String[] args) {
        Number37 t1 = new Number37(9);
        Number37 t2 = new Number37(27);

        System.out.println(t1.x + " *** " + t2.x);
    }
}
