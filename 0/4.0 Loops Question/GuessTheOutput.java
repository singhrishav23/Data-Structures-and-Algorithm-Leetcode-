//1 --> How many time "Hello" is going to get printed

public class GuessTheOutput {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"); // --> 3 baar print hoga --> wrong answer diya 2 baar print hoga
            i += 2;
        }
    }
    
}
