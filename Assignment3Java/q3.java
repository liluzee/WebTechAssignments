package MISC.Assignment3Java;

import java.util.*;
import java.util.Scanner;

public class q3 {
  public static void main(String[] args) {
    // Taking a string as input
    Scanner ip = new Scanner(System.in);
    System.out.print("Input string: ");
    String s = ip.nextLine();

    // Converting the string to a character array and then using the inbuilt array
    // sort method.
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    s = new String(arr);

    // Printing the sorted string.
    System.out.println("Sorted string is: " + s);
    ip.close();
  }
}
