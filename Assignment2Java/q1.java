package Assignment2Java;

import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);

    double score = ip.nextDouble();

    if (score <= 90 && score >= 80) {
      score += 5;
    }

    System.out.println(score);
  }

}
