package algorithm;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("The largest number is " + number1);
        } else {
            System.out.println("The largest number is " + number2);
        }
    }
}





/*
 * BEGIN READ number1 READ number2 IF number1 > number2 THEN PRINT
 * "The largest number is " + number1 ELSE PRINT "The largest number is " +
 * number2 END IF END
 */





