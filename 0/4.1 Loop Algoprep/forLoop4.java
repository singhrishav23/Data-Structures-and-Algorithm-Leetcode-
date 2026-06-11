//4 --> break statement

public class forLoop4 {

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            System.out.println(i); // i=3 exit loop
            if (i == 3) {
                break; //The moment you execute break, you exit the Loop
            }
        }
        
    }
    
}
