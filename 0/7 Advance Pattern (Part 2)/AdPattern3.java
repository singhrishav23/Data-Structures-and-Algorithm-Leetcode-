//3 --> Inverted Half-Pyramid with Numbers

public class AdPattern3 {

    public static void I_HalfPyramid_Number (int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        I_HalfPyramid_Number(4);
    }
    
}
