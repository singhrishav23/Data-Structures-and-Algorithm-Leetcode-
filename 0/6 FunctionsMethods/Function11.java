//11 --> Binary to Decimal Conversion

/*

  Binary --> (0,1)
  Decimal --> (0 to 9)
 
*/

public class Function11 {

    public static void biTodec (int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++ ;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        biTodec(101);
        biTodec(111);
    }
    
}
