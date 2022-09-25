package Assignment2Java;

public class q4 {
  public static void main(String[] args) {
    double population = 80000;
    int years = 0;
    // while loop to check when population crosses 150000
    // and to keep changing it according to the question
    // and incrementing years.
    while (population <= 150000) {
      population *= 1.05;
      years += 1;
    }

    System.out.println(years);
  }
}
