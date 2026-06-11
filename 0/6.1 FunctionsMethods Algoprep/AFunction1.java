//1 --> Calculate factorial of Num (n)

public class AFunction1 {

    public static int Fact (int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int nFact = Fact(5);
        System.out.println(nFact);
    }
    
}
