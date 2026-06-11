//2 --> Inverted and Rotated Half-Pyramid

public class AdPattern2 {

    public static void I_R_HalfPyramid (int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
            
        }

    }

    public static void main(String[] args) {

        I_R_HalfPyramid(4);
        
    }
    
}
