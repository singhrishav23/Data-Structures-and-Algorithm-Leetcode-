//Palindromin Patten with Number

public class AdPattern11 {

    public static void PNumPattern (int n) {
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // descending to ascendiing
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //ascending to descending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        PNumPattern(5);
    }
     
}
