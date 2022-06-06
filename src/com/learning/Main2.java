package com.learning;

public class Main2 {
    
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        
        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMindoubleValue);
        System.out.println("double maximum value = " + myMaxdoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5.25f / 2f;
        double myDoubleValue = 5.25d / 2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        double pound = 1d;
        double kilogram = 0.45359237 * pound;
        System.out.println("kilograms = " + kilogram + "pounds");

        char myChar = 'D';
        char myUnicodeChar = '\u005D';
        System.out.println(myUnicodeChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
    
}
