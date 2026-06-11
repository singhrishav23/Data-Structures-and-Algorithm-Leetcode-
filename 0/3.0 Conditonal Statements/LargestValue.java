//2

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater");
        }
        if (a == b) {
            System.out.println("A = B");
        }
        else {
            System.out.println("B is grater");
        }
    }
}
