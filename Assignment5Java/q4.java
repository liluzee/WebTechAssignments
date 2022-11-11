package MISC.Assignment5Java;

// There are two mistakes in the following snippet, one is the colon
// instead of the semicolon in the m1 function and the second is that the
// v in Void is capital, once we correct the following changes, we get 24 as output.
public class Myclass {
  static int a = 20;

  Myclass() {
    a++;
  }

  Void m1() {
    a++;
    System.out.println(a):
  }

  public static void main(String[] args) {
    Myclass obj = new Myclass();
    Myclass obj2 = new Myclass();
    Myclass obj3 = new Myclass();
    obj3.m1();
  }
}
