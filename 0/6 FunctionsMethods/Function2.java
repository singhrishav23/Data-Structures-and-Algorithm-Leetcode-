//2 --> Function with parameter (Sum of a & b)


import java.util.Scanner;

public class Function2 {

    public static int Calculation (int num1, int num2){  //parameters or formal parameters
        
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Calculation(a, b); //arguements or actual parameters
        System.out.println("The sum of a + b = " + sum);

    }
    
}
