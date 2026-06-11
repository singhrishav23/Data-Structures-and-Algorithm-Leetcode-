//5

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("It is a Leap year");
        } else {
            System.out.println("It is not a Leap year");
        }
        
    }
    
}
