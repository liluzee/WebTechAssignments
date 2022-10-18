package MISC.Assignment3Java;

import java.util.*;

public class q4 {

  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);

    System.out.println("Enter n : ");
    int n = ip.nextInt();

    System.out.print("Hailstone Sequence for " + n + " is: ");

    // While n is not equal to 1 check if n is even,
    // Do the following steps while n is not equal to 1 :
    // if n is even, then reduce it by half
    // otherwise increment it by multiplying it by three and adding one.
    // Also, print the value of n at each iteration.
    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
      }

      else {
        n = (3 * n) + 1;
      }

      System.out.print(n + " ");
    }

    ip.close();
  }

}
