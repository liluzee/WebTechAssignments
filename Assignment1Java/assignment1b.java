package Assignment1Java;

import java.util.Scanner;

public class assignment1b {
  // Question 2 - Product of two floating point numbers
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Input first floating point number : ");
    float firstNumber = ip.nextFloat();
    System.out.println("Input second floating point number : ");
    float secondNumber = ip.nextFloat();

    float product = firstNumber * secondNumber;

    System.out.println("Product of the two numbers is : " + product);
  }

}
