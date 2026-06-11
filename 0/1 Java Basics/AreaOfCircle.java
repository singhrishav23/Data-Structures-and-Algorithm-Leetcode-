// 10

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle : ");
        float rad = sc.nextFloat();

        float area = 3.14f * rad * rad; //Java automatically har decimal value ko float consider krta, so we use f after 3.14
        System.out.println("Area of Circle = " + area);
    }
}