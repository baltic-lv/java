package com.balticman.hello;

import java.util.Scanner;

/*5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/


public class InputMultiply_005 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert 1st number, please: ");
        int number1 = reader.nextInt();
        System.out.println("Insert 2nd number, please: ");
        int number2 = reader.nextInt();
        System.out.println(number1 + " x " + number2 + " = " + number1 * number2);
    }

}
