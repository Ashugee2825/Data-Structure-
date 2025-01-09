package algorithm;

import java.util.Scanner;




/*3.	Write pseudo code that performs the following: 
	Ask a user to enter a number.
	If the number is between 0 and 10,
	write the word blue. If the number is between 10 and 20,
	write the word red. If the number is between 20 and 30,
	write the word green. If it is any other number,
    write that it is not a correct color option.*/

public class ColorBasedOnNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            System.out.println("blue");
        } else if (number >= 10 && number < 20) {
            System.out.println("red");
        } else if (number >= 20 && number < 30) {
            System.out.println("green");
        } else {
            System.out.println("Not a correct color option.");
        }
    }
}




/*
 * BEGIN READ number IF number >= 0 AND number < 10 THEN PRINT "blue" ELSE IF
 * number >= 10 AND number < 20 THEN PRINT "red" ELSE IF number >= 20 AND number
 * < 30 THEN PRINT "green" ELSE PRINT "Not a correct color option." END IF END
 */
