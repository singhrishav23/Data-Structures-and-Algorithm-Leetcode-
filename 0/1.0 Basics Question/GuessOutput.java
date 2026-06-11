//Q4

public class GuessOutput {

    public static void main(String[] args) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        //Ans double me aayega kyuki sabse datatype double hai

        double result = ( f * b ) + ( i % c ) - ( d * s);
        // So the answer is 12.56 + 30 - 51197.6448 = -51155.0848 ---> Correct answer
        
        System.out.println(result);
        
    }
    
}
