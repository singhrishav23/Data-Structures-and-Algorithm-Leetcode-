//3 --> Swap a & b example of Call by Value


public class Function3 {

    public static void SwapOf (int a, int b) { //parameter
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        SwapOf(a, b); //arguement

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        //Call by value --> Original value same rahegi bs copy me change hoga
        
        
    }
    
}
