//4

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want a multiplication table of ");
        int n =  sc.nextInt();

        int res;

        for (int i = 1; i <= 10; i++) {
            res = n * i ;
            System.out.println(n + " * " + i + " = " + res);
        }
        
    }
    
}
