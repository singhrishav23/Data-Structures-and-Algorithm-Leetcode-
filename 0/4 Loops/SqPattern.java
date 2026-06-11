//6 --> Print Square Pattern

package Loops;

public class SqPattern {

    public static void main(String[] args) {

        //Using for loop
        for (int i = 1 ; i <= 4 ; i++) {
            System.out.println("****");
        }
        
        System.out.println();
        
        //using while loop
        int lines = 4;
        int counter = 1;
        while (counter <= lines) {
            System.out.println("****");
            counter++ ;
        }
        
    }
    
}
