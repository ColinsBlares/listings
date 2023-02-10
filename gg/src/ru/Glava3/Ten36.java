package ru.Glava3;

class Ten36 {
    int x;

    Ten36(){
        x=10;
    }
}

class TenDemo {
    public static void main(String[] args) {
        Ten36 s1 = new Ten36();
        Ten36 s2 = new Ten36();

        if (s1.x == s2.x)
            System.out.println(s1.x + " = " + s2.x);
    }
}