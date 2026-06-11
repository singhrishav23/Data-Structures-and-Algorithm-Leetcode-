//2 --> Create a isEven method, it should return true if the num is even, or false otherwise.

public class Practice2 {

    public static boolean isEven (int n) {
        boolean isEven = false;

        if (n % 2 == 0) {
            isEven = true;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
    
}
