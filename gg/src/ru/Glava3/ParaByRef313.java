package ru.Glava3;

class ParaByRef313 {
    int x,y;

    ParaByRef313(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void callByRef (ParaByRef313 o) {
        o.x = o.x + this.x;
        o.y = o.y + this.y;
    }
}

class ParaByRefDemo{
    public static void main(String[] args) {

    ParaByRef313 p = new ParaByRef313(2, 3);
    ParaByRef313 q = new ParaByRef313(3,2);

    System.out.println("q.x = " + q.x);
    System.out.println("q.y = " + q.y);

    p.callByRef(q);

    System.out.println("q.x ="+ q.x);
    System.out.println("q.y ="+ q.y);
    }
}
