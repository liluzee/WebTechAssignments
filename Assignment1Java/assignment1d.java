package Assignment1Java;

import java.util.Scanner;

public class assignment1d {
  // Question 4 - Swapping two numbers with and without using a temporary variable
  public static void main(String[] args) {

    int a = 1;
    int b = 2;
    System.out.println("Initial values a : " + a + " b : " + b);

    // Swap using temporary variables

    int temp = a;
    a = b;
    b = temp;

    System.out.println("Confirming swap a : " + a + " b : " + b);

    int c = 3;
    int d = 4;

    System.out.println("Initial values c : " + c + " d : " + d);

    // Swap without temporary variable
    c = c + d;
    d = c - d;
    c = c - d;

    System.out.println("Confirming swap c : " + c + " d : " + d);
  }

}
