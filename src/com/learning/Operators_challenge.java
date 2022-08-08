package com.learning;

public class Operators_challenge {
    public static void main(String[] args){
        double a =20.00d;
        double b =80.00d;
        double c = 100*(a+b);
        System.out.println("value of multiplication is =" + c);
        double reminder = c%40.00;
        System.out.println("Value of reminder is = " + reminder);
        boolean e = reminder == 0?true:false;
        System.out.println("the statement is " + e );
    }
}
