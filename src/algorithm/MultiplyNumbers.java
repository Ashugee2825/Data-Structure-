package algorithm;


// 

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        int product = number1 * number2;
        System.out.println("Product: " + product);
    }
}

/*
 * BEGIN READ number1 READ number2 SET product TO number1 * number2 PRINT
 * product END
 */