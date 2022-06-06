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
/* Overflow and underflow in Java:

If you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java, then you will get an Overflow in the case of the maximum value or an Underflow in the case of the minimum.

Size of Primitive Types and Width:

 A byte occupies 8 bits. A bit is not directly represented in a primitive type- We have a boolean which is not really the same thing that we will discuss in a future video. So a Byte occupies 8 bits. We say that a byte has a width of 8.

A short can store a large range of numbers and occupies 16 bits, and has a width of 16.
A int, has a much larger range as we know, and occupies 32 bits, and has a width of 32.

The point here is that each primitive type occupies a different amount of memory- we can see that an int needs four times the amount of space, than a byte does for example.

It's not particularly relevant for you to know these numbers, but it could come up as an interview question and it is useful to know that certain data types take up more space than others.

 Arthmetic and Casting:


Let' look at Arthmetic and then a concept known as Casting.

Casting in Java:

Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis like this:

(byte) (myMinByteValue/2);

Other languages have casting, this is not just a Java thing.

Primitive types Challenge

Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter. Create a short variable and set it to any valid short number.

Create an int variable and set it to any valid int number. Lastly, create a variable of type long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values.

Flaoting point numbers:

Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal point. 3.14159 is an example.

Floating point numbers are also known as real numbers. We use a floating point number when we need more precision in calculations.

Single and double Precision:

Precision refers to the format and amount of space occupied by the type. Single precision occupies 32 bits(so has a width of 32) and a Double precision occupies 64bits (and thus has a width of 64).

As a result the float has a range from 1.4E-45 to 4.4028235E+38 and the double is much more precise with a range from 4.9E-324 to 1.7976931348623157E+308.

Challenge

Thinking back to our discussion on casting which we used to convert both a byte and a short to the int equivalent, how do you think you would do the same for the float to remove the error?


Challenge

Convert a given number of pounds to kilograms

STEPS:
	1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
	2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
	3. Print out the result.
HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.


Floating Point Number Precision Tips:

In general float and double are great for general floating point operations. But both are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.

Java has a class called BigDecimal that overcomes this. We will talk more about that later in the course. For now just keep in the back of your mind that when precise calculations are necessary, such as when performing currency calculation, floating point types should not be used.

But for general calculations float and double are fine. Again, we will discuss it later in the course.

The char and Boolean Primitive Data Types:

Time to look at the last two primitive types- char and boolean.

Char Data Type:

A char occupies two bytes of memory, or 16 bits and thus has a width of 16. The reason it's not just a single byte is that it allows you to store Unicode characters.

Unicode:

Unicode is an international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is assigned a unique numeric value that applies across different platforms and programs.

In the English alphabet, we have the letters A through Z. Meaning only 26 characters are needed in total to represent the entire English alphabet. But other languages need more characters, and often a lot more.

Unicode allows us to represent these languages and the way it works is that by using a combination of the two bytes that a char takes up in memory it can represent and one  of 65535 different types of characters.

Boolean Primitive type

A boolean value allows for two choices True or False, Yes or No, 1 or 0. In Java terms we have boolean primitive type and it can be set to two values only. True or false.


Primitive Types Recap and the String Data Type:

String:

String is a datatype in Java, which is not a primitive type. It's actually a Class, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

What is String?

A String is a sequence of characters.

A String can contain a sequence of characters. A large number of characters. Technically it's limited by memory or the MAX_VALUE of an int which was 2.14 Billion.


*/