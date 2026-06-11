//5
/* 

  Q --> 
  income < 5 lpa = 0% tax
  income 5-10lpa = 20% tax
  income > 10lpa = 30%

*/

import java.util.Scanner;

public class IncomeTaxCalci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax ;

        if (income < 500000) {
            tax = income + 0;
            System.out.println("You have Zero Percent tax" + tax);
        }
        else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
            System.out.println("You have 20 Percent tax" + tax);
        }
        else {
            tax = (int) (income * 0.3) ;
            System.out.println("\"You have 30 Percent tax" + tax);
        }
        
    }
    
}
