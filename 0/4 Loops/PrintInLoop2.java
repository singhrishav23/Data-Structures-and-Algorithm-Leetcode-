//3

package Loops;

import java.util.Scanner;

public class PrintInLoop2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int n = sc.nextInt();

        while (counter <= n) {
            System.out.println(counter);
            counter++ ;
        }
        
        
    }
    
}
