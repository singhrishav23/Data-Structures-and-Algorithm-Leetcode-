/*
  2 --> Given positive numbers ke factors find krna hai.
Numbers are {12, 17, 24}

Factors --> Number that completely divide n 

factors of 12 --> 1, 2, 3, 4, 6, 12
factors of 17 --> 1, 17
factors of 24 --> 1, 2, 3, 4, 6, 8, 12, 24

*/

import java.util.Scanner;

public class forLoop2 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number you want factorial of : ");
      int n = sc.nextInt();

      for (int i = 1; i <=n ; i++) {
        if (n % i == 0) {
          System.out.println(i);
        }
      }
        
    }
    
}
