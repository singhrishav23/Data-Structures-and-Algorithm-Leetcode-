//3 --> Logical Operator


public class Lop {

    public static void main(String[] args) {

        // Logical AND
        System.out.println(1==1 && 2==2); // T T = T
        System.out.println(1==1 && 2==1); // T F = F
        System.out.println(1==2 && 2==2); // F T = F
        System.out.println(1==2 && 2==1); // F F = F

        // Logical OR
        System.out.println(1==1 || 2==2); // T T = T
        System.out.println(1==1 || 2==1); // T F = T
        System.out.println(1==2 || 2==2); // F T = T
        System.out.println(1==2 || 2==1); // F F = F

        // Logical NOT
        System.out.println( !(1>2) ); // F --> T kr dega
        System.out.println( !(1<2) ); // T --> F kr dega

    }
    
}

/*
  
   Logical Operator
   {
    && --> Logical AND
    || --> Logical OR
    !  --> LOgical Not
   }
 
*/
