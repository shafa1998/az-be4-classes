package lesson01;

import java.util.Scanner;

public class HelloWorldApp {

  static int k;

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

    // declaration
    int x;
//    x = 33;
//    int y = 66;
//    System.out.println(x);
    System.out.println(k);



  }
}
