//MODULE 1 Questions
//Q1

import java.util.Scanner;

public class FindAve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Enter value of c : ");
        int c = sc.nextInt();

        int ave = (a + b + c) / 3; 
        
        System.out.println("The average of 3 input numbers is : " + ave);
        
    }
    
}
