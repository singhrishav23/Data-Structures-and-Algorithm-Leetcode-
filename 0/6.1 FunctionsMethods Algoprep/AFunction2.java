//2 Calculate nCr. --> n=5 , r=3

import java.util.Scanner;

public class AFunction2 {

    public static int Fact (int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFact = Fact(n);
        int rFact = Fact(r);
        
        int nmrFact = Fact(n - r);

        int ans = nFact / (rFact * nmrFact);
        System.out.println(ans);
    }
}
