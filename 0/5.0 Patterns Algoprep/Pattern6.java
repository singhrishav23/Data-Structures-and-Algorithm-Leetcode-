import java.util.Scanner;

/*

  if n=5:
        *** ***
        **   **
        *     *
        **   **
        *** ***
 
*/

public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (odd number) : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number : ");
            return ;
        }

        int nst = n / 2 + 1;
        int nsp = 1 ;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            
            for (int l = 1; l <= nst; l++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < n / 2 + 1) {
                nst-- ;
                nsp += 2;
            } else {
                nst++ ;
                nsp -= 2;
            }
        }

        
    }
    
}
