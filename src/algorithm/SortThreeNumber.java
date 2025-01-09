package algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class SortThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        int[] numbers = {number1, number2, number3};
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

