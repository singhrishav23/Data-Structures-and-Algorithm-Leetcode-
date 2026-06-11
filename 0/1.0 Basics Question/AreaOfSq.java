//Q2

import java.util.Scanner;
public class AreaOfSq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side of square : ");
        int side = sc.nextInt();

        int area = (side * side);
        System.out.println("The Area of Square is : " + area);

    }
}
