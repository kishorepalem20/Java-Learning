package com.learning;

public class ifthen {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        int topScore = 80;
        if (topScore <100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 95;
        if ((topScore >secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) ||(secondTopScore <=90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }
    }
}
/*
The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true.

This is known as conditional logic

Conditional logic uses specific statements in Java tp allow us to check a condition and execute code based on whether that condition (the expression) is true or false.

The AND operator comes in two flavors in Java, as does the OR operator.

&& is the logical AND which operates on boolean operands- checking if a given condition is true or false.

You will almost always want to be doing this. The & is a bitwise operator working at the bit level. This is an advanced concept that we won't get into here.

Likewise || is the logical OR what again operates on boolean operands- checking if a given condition is true or false.

Again, you will almost want to be doing this. The | is a bitwise operator working at the bit level.

The ! or NOT Operator is also known as the Logical Complement Operator.

For use with booleans it test the alternate value- we saw(isCar) tests for true, by adding a ! operator before the value we can check the oppsote-false in this case.
boolean isCar = false;

we can use either of these statements:
if(isCar == false)
if(!isCar)
to check if the boolean isCar is false.
Ternary Operator ? :
The Ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.

It's a shortcut of the if-then-else statement(else we will be discussing later).

int ageOfClient = 20;
boolean isEighteenOrOver = ageOfClient == 20?true:false;
Operand one-ageOfClient == 20 in this case is the condition we are checking. It needs to return true or false.
Operand two - true here is the value to assign to the variable isEighteenOrOver if the condition above is true.
Operand three - false here is the value to assign to the variable isEighteenOrOver if the condition is false.
*/