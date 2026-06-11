//7 --> Reverse a number, n = 10899
/*

  Logic --> Last digit chahiye toh, num%10
        --> Last digit remove krna hai toh, num/10
 
*/
package Loops;

public class ReverseNum {

    public static void main(String[] args) {

        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10; //to get last digit
            System.out.print(lastDigit + " ");
            n = n/10; //to remove last digit
        }
        
    }
    
}
