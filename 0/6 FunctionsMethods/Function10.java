//10 --> Print a Prime Number in Range --> Ek given range ke andar ke sare prime number find krna hai

public class Function10 {

    public static boolean isPrime (int n) {

        if (n == 2) {
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true ;
    }

    public static void PrimeInRange (int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeInRange(20);
    }
    
}
