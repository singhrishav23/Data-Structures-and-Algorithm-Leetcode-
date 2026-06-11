// 7

import java.util.*;
import java.util.Scanner;

public class InputJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //For String input
        System.out.println("Enter a single word : ");
        String input = sc.next(); // next() --->for single word input
        System.out.println(input);

        System.out.println("Enter more than a single world : ");
        String name = sc.nextLine(); // nextLine() ---> for more than single word as an input
        System.out.println(name);

        //For Integer input
        System.out.println("Enter your interger : ");
        int num = sc.nextInt();
        System.out.println(num);

    }
}

/*
  Humare input pr depend karta hai ki humara function kaisa hoga
  1 next ---> for single word input
  2 nextLine ---> for a String mor than one word
  3 nextInt ---> Intger
  4 nextByte ---> Byte
  5 nextFloat ---> Float
  6 nextDouble ---> double
  7 nextBoolean ---> Boolean
  8 nextShort ---> Short
  9 nextLong ---> Long
 */
