//11

package Loops;

import java.util.Scanner;

public class ContinueStQ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue; // use to skip an iteration
            }
            System.out.println(n);
        } while (true);
        
    }
    
}
