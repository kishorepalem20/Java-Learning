package com.learning;

public class Main {
    public static void main(String[] args){

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Minimum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Minimum value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum value = " + myMinLongValue);
        System.out.println("long Minimum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        byte challengeByteValue = (byte) (myMaxByteValue / 2 );
        short challengeShortValue = (short) (myMaxShortValue / 2);
        int challengeIntValue = (myMaxIntValue / 2);
        long challengeLongValue =  (50000L + (10L * ((challengeByteValue) + (challengeShortValue) + (challengeIntValue))));
        System.out.println(challengeLongValue);
    }
}
/* Public class Hello {
}
Public:

The public Java keyword is an access modifier. An access modifier allows us to define the scope or how other parts of your code or even some else's code can access this code.

Class:

Defining a class. The class keyword is used to define a class with the name following the keyword- Hello in this case and left and right curly braces to define the class block.


To define a class requires an optional access modifier, followed by class, followed by the left and right curly braces.

The left and right curly braces are defining the class body- anything in between them is "part" fo this class. We can have data and code as you will see as we progress.

Defining the Main Method:

What is method?

It's a collection of statements(one or more) that performs an operation. We'll be using a special method called the main method that java looks for when running a program. It's the entry point of any Java code.

Public class Hello {

	Public static void main(String[] args){
	}
}

Public is an access modifier we discussed when defining the class in the last video-same principle.

Static is a Java keyword that needs an understanding of other concepts, for now, know that we need to have static for java to find our method to run the code we are going to add.

Void is yet another java keyword used to indicate that the method will not return anything.

The left and right paranthesis in a method declaration are mandatory and can optionally include one or more parameters- which is a way to pass information to a method.

Code block - A code block is used to define a block of code. It’s mandatory to have one in a method declaration and it's here where we will be adding statements to perform certain tasks.

Statement- This is a complete command to be executed and can include one or more expressions.

What are variables?

Variables are a way to store information in our computer. Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computers random access memory(RAM).

A variable, as the name suggests can be changed, in other words, it's contents are variable.

What we have to do is tell the computer what type of information we want to store in the variable, and then give it a name.

There are lots of different types of data we can define for our variables. Collectively these are known as Data types. As you may have gussed, data types are keywords in Java.

Let's start out by defining a variable of type int-int being an abbrevia whole number(that is a number without any decimal points).

To define a variable we need to specify the data type, then give our variable a name, and optionally add an expresssion to initialize the variable with a value.

Declaration Statement:

Used to define a variable by indicating the data type, and the name, and optionally to set the variable to a certain value.


Here, the type(short for Data type) is an int, the name is myFirstNumber and the value we are assigning or initializing our variable with is 5. We are declaring a variable of type int with the name myFirstNumber and assigning the value 5 to it.

Expression:

This is to construct that evaluates to a single value.


String literal

Any sequence of characters surrounded by double quotes is a String literal in Java. It's value cannot be changed, unlike a variable.

Java Operators:

Java operators or just operators perform an operation(hence the word) on a variable or value. +,-,/ and * are four common ones that I feel sure you are familiar with.

Variables and expressions

Challenge

Create additional variables.
Declare the following variables and add to our program.
mySecondNumber which is an int and assign a value of 12 to it.
myThirdNumber, is also an int with a value of 6.

Primitive types:
In java primitive types are the most basic data types. The int is one of eight primitive types.

The eight primitive data types in Java are boolean, byte, char, short, int, long, float and double. Consider these types as the building blocks of data manipulation. Let's explore the eight primitive types in Java.

Java Packages:
 A package is a way to organize your Java projects. For now, consider them as folders with learningprogramming in our example being a subfolder of academy. Companies use their domain names reserved.

Wrapper classes

Java uses the concept of a wrapper class for all eight primitive types- In the case of an int, we can use Integer, and by doing that it gives us ways to perform operations on an int.



In this case, we are using the MIN_VALUE and MAX_VALUE to get java to tell us the minimum and maximum ranges of numbers that can be stored.

*/