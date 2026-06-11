//7 --> Ternary Operator

import java.util.Scanner;

public class TernaryOP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //Ternary Operator
        //DataType with var Jisme answer hoga = (condition)? s1 : s2 ;
        String res = (num >= 18) ? ("Adult") : (" Not Adult") ;
        System.out.println(res);
        
    }
    
}

/*

  Ternary Operator
  SYNTAX :
  variable = condition? statement1 : statement2 ;
  input    = cond. Check? ifTrue : elseFalse ;
 
*/