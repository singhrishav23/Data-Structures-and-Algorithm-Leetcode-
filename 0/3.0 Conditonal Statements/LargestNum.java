//6
//Q --> print largest of 3 number

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println("A is greater than B & C");
        }
        else if (B > A && B > C) {
            System.out.println("B is greater than A & C");
        }
        else {
            System.out.println("C is greater than A & B");
        }
        
    }
    
}
