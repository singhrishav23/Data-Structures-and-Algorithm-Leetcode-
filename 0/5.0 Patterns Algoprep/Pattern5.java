import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd value of n: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number!");
            return; // This exits the program if an even number is entered.
        }

        int nst = 1;  // Number of stars
        int nsp = n / 2;  // Number of spaces

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }

            System.out.println();

            // Update nsp and nst for the next row
            if (i < n / 2 + 1) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }
}
