package lesson01;

import java.util.Scanner;

public class CalcApp {

  public static void main(String[] args) {
    // 1
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number a:");
    int a = in.nextInt();
    System.out.print("Enter the number b:");
    int b = in.nextInt();

    // 2
    int c = a + b;

    // 3
    System.out.printf("The sum is: %d\n", c);
  }

}
