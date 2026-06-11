//8

//Function Overloading using DataTypes

public class Function8 {

    public static int Product (int a, int b) {
        return a * b ;
    }

    public static float Product (float a, float b) {
        return a * b ;
    }

    public static void main(String[] args) {

        System.out.println(Product(2.5f, 2.0f));
        System.out.println(Product(5, 2));
        
    }
    
}
