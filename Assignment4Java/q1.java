package MISC.Assignment4Java;

import java.util.*;

public class q1 {
  public static void main(String[] args) {

    // Take the size of vector as input from user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the vector : ");
    int size_of_vector = input.nextInt();
    Vector<Integer> myVector = new Vector<Integer>(size_of_vector);

    // Take the objects to be stored in the vector from the user
    System.out.println("Input the elements : ");
    for (int i = 0; i < size_of_vector; i++) {
      int tmp = input.nextInt();
      myVector.addElement(tmp);
    }
    input.close();

    // Display the values of vector
    System.out.println("The values in the vector are : ");
    System.out.print("{");
    for (int i = 0; i < size_of_vector; i++) {
      System.out.print(" " + myVector.elementAt(i));
    }
    System.out.print(" }");
  }
}
