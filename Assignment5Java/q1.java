package MISC.Assignment5Java;

public class q1 {

  public static void main(String args[]) {

    Mammals mammalsObject = new Mammals();
    MarineAnimals marineAnimalsObject = new MarineAnimals();
    BlueWhale blueWhaleObject = new BlueWhale();
    mammalsObject.print(); // 1
    marineAnimalsObject.print(); // 2
    blueWhaleObject.print(); // 3

    // Since multiple inheritance is not supported, the 4th point cannot be
    // implemented,
    // thus the first three are done only without any inheritance.
  }

}
/*
 * Since multiple inheritance is not allowed in java, BlueWhale cannot inherit
 * from both Mammals and MarineAnimals
 */

public class Mammals {

  void print() {
    System.out.println("I am mammal");
  }

}

public class MarineAnimals {

  void print() {
    System.out.println("I am a marine animal");
  }

}

public class BlueWhale {

  void print() {
    System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
  }

}
