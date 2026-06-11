//10 --> Keep entering numbers till user enter a multiple of 10

package Loops;

import java.util.Scanner;

public class BreakStQ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a num : ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break; // use to break an iteration
            }
            System.out.println(n);
        } while (true);
        
    }
    
}
