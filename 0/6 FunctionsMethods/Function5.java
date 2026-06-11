//5 --> Factorial of n

public class Function5 {


    public static int Fact(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f; // factorial of n
    }

    public static void main(String[] args) {

        int ans = Fact(5);
        System.out.println(ans);

        //OR

        System.out.println(Fact(4));
        
    }
    
}
