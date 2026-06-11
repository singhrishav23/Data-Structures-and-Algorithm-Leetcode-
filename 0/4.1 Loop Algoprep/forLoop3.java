/*

  Prime or Not prime?
  Given {3, 13, 25}
  3 --> (1, 3) --> Prime
  13 --> (1, 13) --> Prime
  25 --> (1, 5, 25) --> Not Prime/Composite

  Prime --> No. divisible by 1 and itself

*/

import java.util.Scanner;

public class forLoop3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++ ;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
        
        
    }
    
}
