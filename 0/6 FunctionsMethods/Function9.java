//9 --> Prime or Not

public class Function9 {
    

    // Normal Approach Not Optimised
    public static boolean isPrime (int n) { 

        if (n == 2) {
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++) { // n/2 ka replacement underroot n
      //for (int i = 2; i <= Math.sprt(n); i++)
            if (n % i == 0) {
                isPrime = false;
                break ;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(91));
    }
    
}
