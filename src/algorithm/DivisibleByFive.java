package algorithm;

import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number  ");
		int number = scanner.nextInt();
		if(number % 5 == 0) {
			System.out.println("The number is Division by 5");
		}else {
			System.out.println("The number is not Division by 5 ");
		}
		
	}

}


/*
 * BEGIN READ number IF number % 5 == 0 THEN PRINT
 * "The number is divisible by 5." ELSE PRINT
 * "The number is not divisible by 5." END IF END
 */
