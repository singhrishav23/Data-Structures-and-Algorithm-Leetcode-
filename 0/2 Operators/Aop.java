//Module 2

//1 --> Arithmetic Operator


import java.util.Scanner;

public class Aop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Binary Operator
        /* 
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println(a+b); //add
        System.out.println(a-b); //sub
        System.out.println(a*b); //multiply
        System.out.println(a/b); //divide
        System.out.println(a%b); //Modulo --> return remainder
        */

        //Unary Operator
        //Pre Increment -->Pehle increse then print
        int c = 5;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        //Post Increment
        int e = 5;
        int f = c++;
        System.out.println(e);
        System.out.println(f);

        //NOte : Same goes for decrement operator

    }
    
}


/*
   
   Arithemetic Operator

   1) Binary Operator --> Jisme 2 operand mandatory hai operator ko operate krne ke liye
   {
    + , - , * , / , %
   }

   2) Unary Operator

   {
    ++ , --
   }
   ++ --> Increment
      1) Pre Increment
      ++a

      2) Post Increment
      a++

   -- --> Decrement
      1) Pre Decrement
      --a

      2) Post Decrement
      a--


*/