//5 --> What's wrong here?


public class Debug {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i); //the i here is the problem because of the scope issues, the scope of i is limited to the for loop only
        
    }
    
}
