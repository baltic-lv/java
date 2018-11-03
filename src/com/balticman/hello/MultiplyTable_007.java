package com.balticman.hello;

import java.util.Scanner;

/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
public class MultiplyTable_007 {
    public static void main(String[] args) {
        System.out.println("Give me number, please: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
