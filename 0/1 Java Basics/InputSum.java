// 8

import java.util.Scanner;

public class InputSum{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = in.nextInt(); // input1

        System.out.println("Enter value of b : ");
        int b = in.nextInt(); //input2

        int sum = a + b; // input1 + input2

        System.out.println("The sum of a & b is : " + sum);
    }
}
