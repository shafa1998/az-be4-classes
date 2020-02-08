package lesson02.warmup;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("Hello, what is your name?");
        String name = ab.next();
        System.out.println("Hello, "+ name);
        System.out.println("Nice to meet you" +name+"!");
        System.out.println( "Bye!");
    }
}
