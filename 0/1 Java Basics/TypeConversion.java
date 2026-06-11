//11

public class TypeConversion {
    public static void main(String[] args) {

        //Implicit or Automatic
        int a = 25;
        long b = a;
        System.out.println(b);

        //Explicit
        float c = 25.9999f ;
        int d = (int) c ; // Data loss after decimal
        System.out.println(d);

        //Char to Num
        char ch1 = 'a'; //every char some int value in int type in java its a continuous series
        char ch2 = 'b';
        int N1 = ch1 ;
        int N2 = ch2 ;
        System.out.println(N1);
        System.out.println(N2);

    }
}



/*
   Type Conversion

   1)Implicit Or Widening
   { Designated type > Source type }
   byte->short->int->float->long->double

   2)Explicit Or Narrowing
   {Designated < Source type} results in data loss

   So here we do type casting
   from double-> to ->byte

*/