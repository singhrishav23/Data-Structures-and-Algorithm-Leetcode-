//5 --> continue statement

public class forLoop5 {

    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            if (i == 2) {
                continue; // skip the current iteration and move on to next
            }
            System.out.println(i);
        }
        
    }
    
}
