//6 --> Binomial Coeffcient

/*

  Formula --> nCr = n! / r! (n-r)!
 
*/

public class Function6 {

    public static int Fact(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinoCoeff(int n, int r) {
        int fact_n = Fact(n);
        int fact_r = Fact(r);

        int fact_nmr = Fact(n-r);

        int BinoCoeff = fact_n / (fact_r * fact_nmr);
        return BinoCoeff;
    }

    public static void main(String[] args) {
        System.out.println(BinoCoeff(5,2));
    }
    
}
