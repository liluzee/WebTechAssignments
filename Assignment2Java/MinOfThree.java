package Assignment2Java;

public class MinOfThree {
  public static void main(String[] args) {
    // Taking string input from console arguments and parsing them into integers
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    if (a <= b) {
      if (c <= a) {
        System.out.println(c);
      } else {
        System.out.println(a);
      }
    } else {
      if (b <= c) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }
  }
}
