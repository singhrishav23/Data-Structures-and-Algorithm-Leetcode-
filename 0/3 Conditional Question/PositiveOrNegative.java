//1
// Module 3 --> Question

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Te number is postive");
        }
        else if (num < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The is you entered is Zero");
        }
        
    }
    
}
