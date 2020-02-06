package lesson01;

import java.util.Scanner;

public class ControlStructures {
  public static void main1(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number a:");
    int a = in.nextInt();
    System.out.print("Enter the number b:");
    int b = in.nextInt();
    if (b != 0) {
      int c = a / b;
      System.out.println(c);
    } else {
      System.out.println("No way to divide by 0");
    }
  }

  public static void main2(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number a:");
    int a = in.nextInt();
    switch (a) {
      case 1:
        System.out.println("a=1");
        break;
      case 2:
        System.out.println("a=2");
        break;
      default:
        System.out.println("a=not (1 or 2)");
    }
  }

  public static void main(String[] args) {

    for (int i=1; i<5; i++) {
      System.out.println(i);
    }

    for (int i=1;; i++) {
      System.out.println(i);
      if (!(i<5)) break;
    }

    System.out.println("===");
    for (int i=1; i<5;) {
      System.out.println(i);
      i++;
    }
    System.out.println("===");
    int j=1;
    for (; j<5; j++) {
      System.out.println(j);
    }

  }
}
