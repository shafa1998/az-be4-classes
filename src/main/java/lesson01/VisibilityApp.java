package lesson01;

public class VisibilityApp {

  static int k;

  public static void main(String[] args) {
    // declaration
    int x;
    // won't be compiled.
//    System.out.println(x);

    // will be compiled because of class member
    // output will be 0 - default value
    System.out.println(k);
  }
}
