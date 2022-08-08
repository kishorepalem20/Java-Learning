package com.learning;

public class Operators {
    public static void main(String[] args){
        int result = 1+2 ;
        System.out.println("1+2 = " + result);
        int previouResult = result;
        System.out.println("previousResult = " + previouResult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        result = result * 10; //2*10 =20
        System.out.println("2*10 = " + result);
        result = result /5;
        System.out.println("20/5 = " + result);
        result = result%3;
        System.out.println("4%3 = "+ result);
        result++;
        System.out.println("1+1 = " + result);
        result--;
        System.out.println("2-1 = " + result);
        result += 2;
        System.out.println("1+2 = " + result);
        result *= 10;
        System.out.println("3*10 = " + result);
        result /=3;
        System.out.println("30/3 = " + result);
        result -=2;
        System.out.println("10-2 = " + result);

    }
}

/*
What are Operators?
Operators in Java are special symbols that perform operations on one, two or three operands, and then return a result.
As an example, we used the +(addition) operator to sum the value of two variables in a previous video.

what is an Operand?

An operand is a term used to describe any object that is manipulated by an operator. If we consider this statement.

int myVar = 15 + 12;

Then + is the operator, and 15 and 12 are the operands. Variables used instead of literals are also Operands.

double mySalary = hoursWorked * hourlRate;

In the above line hoursWorked and hourlyRate are operands, and * (multiplication) is the operator.

What is an Expression?

An expression is formed by combining variables, literals, method return values and operators.

In the line belo, 15 + 12 is the expression which has (or returns) 27 in this case.

int myVar = 15 + 12;

What is an Expression?

In the statement below, hoursWorked * hourlyRate is the expression. If hoursWorked was 10.00 and hourlyRate was 20.00
then the expression would return 200.00;

double mySalary = hoursWorked * hourlRate;

what is comment?

Comments are ignored by the computer and are added to a program to help describe something. Comments are there for humans.

We use // in front of any code, or on a blank line. Anything after the // right through to the end of the line is ignored by the computer.

Aside from describing something about a program, comments can be used to temporarily disable code.
 */
