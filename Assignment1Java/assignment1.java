package Assignment1Java;

import java.util.Scanner;

class assignment {
  // Question 1 - Addition and subtraction of two int numbers
  public static int add(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static void main(String[] args) {

    // Taking input
    Scanner ip = new Scanner(System.in);
    System.out.println("Input first number : ");
    int firstNumber = ip.nextInt();
    System.out.println("Input second number : ");
    int secondNumber = ip.nextInt();
    int addAnswer = add(firstNumber, secondNumber);
    int subAnswer = subtract(firstNumber, secondNumber);

    System.out.println("Addition of the two numbers is : " + addAnswer);
    System.out.println("Subtraction of the two numbers is :" + subAnswer);

  }
}