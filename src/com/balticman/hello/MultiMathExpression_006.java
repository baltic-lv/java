package com.balticman.hello;

import java.util.Scanner;

/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
public class MultiMathExpression_006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert 1st number, please: ");
        int number1 = reader.nextInt();
        System.out.println("Insert 2nd number, please: ");
        int number2 = reader.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
    }


}

