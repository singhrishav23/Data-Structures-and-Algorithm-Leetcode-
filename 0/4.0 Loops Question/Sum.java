//2 --> Write a program that read a set of integers, and then print the sum of the even odd integers

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0 ;
        int oddSum = 0 ;

        
        do {
            System.out.println("Enter a number ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? Press 1 if Yes or 0 if No");
            choice = sc.nextInt();
            
        } while (choice == 1);

        System.out.println("The sum of even number is " + evenSum);
        System.out.println("The sum of odd number is " + oddSum);
        
    }
    
}
