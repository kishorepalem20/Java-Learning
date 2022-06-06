package com.learning;

public class StringClass {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}

/*
Strings in Java are immutable:

when I said you can delete characters out of a string, that's not strictly true. Because Strings in Java are immutable. That means you can't change a String after it's created. Instead, what happens is a new String is created.

 The code we used To Append Strings Was inefficient

 As a result of a String being created, appending values like this is inefficient and not recommended.
 */
