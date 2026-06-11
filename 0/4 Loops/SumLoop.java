//4 --> Sum of n natural numbers
// Natural Number --> 1 to ...

package Loops;

import java.util.Scanner;

public class SumLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int add = 1;
        int sum = 0;

        while (add <= N) {
            sum = sum + add ;
            add++ ;
        }
        System.out.println(sum);
        
    }

}
