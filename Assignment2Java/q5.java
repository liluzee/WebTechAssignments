package Assignment2Java;

import java.util.*;

public class q5 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Input the value for n : ");
    int n = ip.nextInt();

    System.out.println("n " + "n^2 " + "n^3 " + "n^4 ");

    for (int i = 1; i <= n; i++) {
      int temp = 1;
      for (int j = 1; j <= 4; j++) {
        temp *= i;
        System.out.print(temp + " ");
      }
      System.out.println();
    }
  }
}
