// MODULE 3

//1 --> if-else

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adult OR Not Adult OR Teenage
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Adult");
        }
        
        if (age > 13 && age <18) {
            System.out.println("Teenage");
        }
        else {
            System.out.println("Not Adult");
        }
        
    }
    
}

/*

   SYNTAX ;

   if(condition){
    statement
   }
   else{
    statement
   }
 
*/
