package algorithm;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stopping point: ");
        int stoppingPoint = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= stoppingPoint; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }
}





/*
 * BEGIN READ stopping_point SET count TO 0 FOR i FROM 1 TO stopping_point IF i
 * % 2 == 0 THEN INCREMENT count END IF NEXT i PRINT count END
 */







