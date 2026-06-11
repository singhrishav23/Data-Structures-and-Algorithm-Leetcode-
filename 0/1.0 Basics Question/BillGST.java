//Q3

import java.util.Scanner;

public class BillGST {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        float TBeforeGSt = A + B + C ;

        float TAfterGST = TBeforeGSt + (0.18f * TBeforeGSt);
        System.out.println("The Bill without GST is : " + TBeforeGSt);
        System.out.println("The Bill with 18 percent GST is : " + TAfterGST);
        
    }
    
}
