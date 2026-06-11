// 12

/*
   
   What is Type Promotion?
   Ans: Consider we have an equation as a+b*c/e
   where, a is int
          b is float
          c is char
          d is long

   So here java do 2 things i.e
   1) byte,short,char ko promote krdeta hai int me
   2) If one operand is largest datatype (long,float,double) in an expression then the whole expression is promoted to largest datatype (long,float,double)
  
*/

public class TypePromotion {
    public static void main(String[] args) {

        // 1st
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a)); //97
        System.out.println((int)(b)); //98

        System.out.println(b-a); // 1

        // 2nd
        int c = 10;
        float d = 20;
        long e = 30;
        double f = 40;
        double ans = c + d + e + f;
        System.out.println(ans);  // yaha sabse bada double hai toh java data loss prevent krne ke liye sabko double me convert kr ke output de raha hai
        
    }
}
