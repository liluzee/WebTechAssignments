package Assignment1Java;

import java.util.Scanner;

public class assignment1c {
  // Question 3 - Quotient and Remainder
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Input dividend : ");
    int dividend = ip.nextInt();
    System.out.println("Input divisor : ");
    int divisor = ip.nextInt();

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient : " + quotient);
    System.out.println("Remainder : " + remainder);
  }

}
