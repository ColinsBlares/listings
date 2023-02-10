package ru.Glava3;

class DivisionByZeroException extends Exception{
    public static String main(String[] args) {
        return "Деление на ноль запрещено!";
    }
}
class ExeptionDemo{
    private static double divide(double dividend, double divisor)
        throws DivisionByZeroException{
        if (divisor == 0)
            throw new DivisionByZeroException();
        return dividend/divisor;
    }

    public static void main(String[] args) {
        try{
            divide(8,0);} catch (DivisionByZeroException dz){
            System.out.println(dz.getMessage());
        }
    }
}