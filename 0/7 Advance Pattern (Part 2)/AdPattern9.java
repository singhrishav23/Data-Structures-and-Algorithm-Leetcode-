//Diamond Pattern

public class AdPattern9 {

    public static void DiamondPattern (int n) {
        for (int i = 1; i <= n; i++) {
            //nsp
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //nst
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            //nsp
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //nst
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        DiamondPattern(4);
    }
    
}
