package algorithm;


//4.	Write pseudo code to print all multiples of 5 between 1 and 100 
/*(including both 1 and 100).*/

public class MultiplesOfFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}


/*
 * BEGIN FOR i FROM 1 TO 100 IF i % 5 == 0 THEN PRINT i END IF NEXT i END
 */
