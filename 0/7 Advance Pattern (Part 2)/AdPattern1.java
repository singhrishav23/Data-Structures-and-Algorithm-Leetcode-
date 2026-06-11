//1 --> Hollow Pattern

public class AdPattern1 {

    public static void HollowPattern (int Trows, int Tcols) { //totalRows , totalColumns

        //Rows ka loop
        for (int i = 1; i <= Trows; i++) {

            // Columns ka loop
            for (int j = 1; j <= Tcols; j++) {

                // 1 and last rows , 1 and last column
                
                if (i == 1 || i == Trows || j == 1 || j == Tcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }

            System.out.println();
            
        }
    }

    public static void main(String[] args) {

        HollowPattern(4,5);

    }
    
}
