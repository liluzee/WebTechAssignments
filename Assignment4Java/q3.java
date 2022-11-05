package MISC.Assignment4Java;

import java.util.*;

public class q3 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double double_val = input.nextDouble();
    Number mynum = new Number(double_val);
    int num = (int) double_val;
    System.out.println("isZero : " + mynum.isZero());
    System.out.println("isPositive : " + mynum.isPositive());
    System.out.println("isNegative : " + mynum.isNegative());
    System.out.println("isOdd : " + mynum.isodd());
    System.out.println("isEven : " + mynum.isEven());
    System.out.println("isPrime : " + mynum.isPrime(num));
    System.out.println("getFactorial : " + mynum.getFactorial(num));
    System.out.println("getSqrt : " + mynum.getSqrt());
    System.out.println("getSqr : " + mynum.getSqr());
    System.out.println("sumDigits : " + mynum.sumDigits(num));
    System.out.println("getReverse : " + mynum.getReverse(num));
    mynum.dispBinary(num);
    System.out.println("isPrime : " + mynum.isPrime(num));

    input.close();
  }
}

class Number {
  private double double_val;

  public Number(double d) {
    double_val = d;
  }

  public boolean isZero() {
    if (double_val == 0.0)
      return true;
    else
      return false;
  }

  public boolean isPositive() {
    if (double_val > 0.0)
      return true;
    else
      return false;
  }

  public boolean isNegative() {
    if (double_val < 0.0)
      return true;
    else
      return false;
  }

  public boolean isodd() {
    if (double_val % 2 != 0.0)
      return true;
    else
      return false;
  }

  public boolean isEven() {
    if (double_val % 2 == 0.0)
      return true;
    else
      return false;
  }

  public boolean isPrime(int n) {
    if (n <= 1)
      return false;

    // Check from 2 to square root of n
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;

    return true;
  }

  public boolean isAmstrong() {
    if (double_val == 0.0)
      return true;
    else
      return false;
  }

  public int sumDigits(int n) {
    int sum = 0;
    while (n != 0) {
      sum = sum + n % 10;
      n = n / 10;
    }
    return sum;
  }

  public int getReverse(int num) {
    int rev_num = 0;
    while (num > 0) {
      rev_num = rev_num * 10 + num % 10;
      num = num / 10;
    }
    return rev_num;
  }

  public double getSqr() {
    double d = double_val * double_val;
    return d;
  }

  public double getSqrt() {
    double d = Math.sqrt(double_val);
    return d;
  }

  public void dispBinary(int n) {
    System.out.println("ByteValue of long_val :" + Integer.toBinaryString(n));
  }

  public int getFactorial(int num) {

    return (num == 1 || num == 0) ? 1 : num * getFactorial(num - 1);

  }
}