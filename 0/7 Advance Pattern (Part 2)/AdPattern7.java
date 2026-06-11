//Solid Rhombus

public class AdPattern7 {

    public static void SolidRhombus (int n){
        for (int i = 1; i <= n; i++) {
            //nsp
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //nst
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        SolidRhombus(5);
    }
    
}
