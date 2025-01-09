package algorithm;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Final sum: " + sum);
    }
}


/*
 * BEGIN SET sum TO 0 WHILE TRUE READ number 
 * IF number < 0 THEN BREAK END IF SET
 * sum TO sum + number END WHILE PRINT sum END
 */

