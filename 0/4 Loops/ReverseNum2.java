//8 --> Reverse, n = 10899
/*
  
Iss baar hume print nhi krna hume asli num ko reverse kr dena hai

*/

package Loops;

public class ReverseNum2 {

    public static void main(String[] args) {

        int n = 10899;

        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
        
    }
    
}
