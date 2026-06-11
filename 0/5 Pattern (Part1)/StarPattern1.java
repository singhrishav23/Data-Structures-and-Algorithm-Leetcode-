//Module 5 --> Patterns

//1
/*

  *
  **
  ***
  ****  
  
*/


public class StarPattern1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4 ; i++) { //for lines

            for (int j = 1; j <= i; j++) { //for star
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
    
}


/*

  Note : To solve a pattern 3 steps are necessary

  1) Check lines --> how many we have print?
  
  2) Check no. of times --> how many times we have to print?
  
  3) What to print --> identify what we have to print?

  
*/