import java.util.Scanner;

class Calculator {
  private int num1;
  private int num2;

  public Calculator(int num1, int num2) {
    // parameterized constructor for initializing num1 and num2
    this.num1 = num1;
    this.num2 = num2;
  }

  public int addition() {
    // addition of num1 and num2
    int ans = num1 + num2;
    System.out.println("Addition is : " + ans);
    return ans;
  }

  public int subtraction() {
    // subtraction of num1 and num2
    int ans = num1 - num2;
    System.out.println("Subtraction is : " + ans);
    return ans;
  }

  public double division() {
    double ans = (double) num1 / num2; // division of num1 and num2
    System.out.println("Division is : " + ans);
    return ans;
  }

  public int multiply() {
    int ans = num1 * num2; // multiplication of num1 and num2
    System.out.println("Multiplication is : " + ans);
    return ans;
  }
}

class Calc {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    try {
      System.out.print("enter the number : ");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.print("enter the number : ");
      num2 = Integer.parseInt(sc.nextLine());

      Calculator obj1 = new Calculator(num1, num2); // declaring and initializing obj1
      obj1.addition(); // calling addition method

      System.out.print("enter the number : ");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.print("enter the number : ");
      num2 = Integer.parseInt(sc.nextLine());

      Calculator obj2 = new Calculator(num1, num2); // declaring and initializing obj2
      obj2.subtraction(); // calling subtraction method

      System.out.print("enter the number : ");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.print("enter the number : ");
      num2 = Integer.parseInt(sc.nextLine());

      Calculator obj3 = new Calculator(num1, num2); // declaring and initializing obj3
      obj3.multiply(); // calling multiply method

      System.out.print("enter the number : ");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.print("enter the number : ");
      num2 = Integer.parseInt(sc.nextLine());

      sc.close();

      Calculator obj4 = new Calculator(num1, num2); // declaring and initializing obj4
      obj4.division(); // calling division method
    }

    catch (NumberFormatException e) {
      // if other than integer input is entered it will catch number format exception
      System.out.println("Invalid input!! " + e);
    }
  }
}