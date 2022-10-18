package MISC.Assignment3Java;

import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {

    // In this program, if the two strings are lexicographically equal we get 0, if
    // s1 is lexicographically greater we get a positive value otherwise we get a
    // negative value.
    Scanner ip = new Scanner(System.in);
    System.out.println("Input String 1 : ");
    String s1 = ip.nextLine();

    System.out.println("Input String 2 : ");
    String s2 = ip.nextLine();

    int difference = 0;

    // We iterate through each character in s1 and s2 and compare these characters
    // using their unicode values
    // If unicode values of the two characters are same, then we continue to the
    // next character otherwise break and the difference is the difference in the
    // unicode values.
    for (int i = 0; i < s1.length() && i < s2.length(); i++) {
      int char1 = s1.charAt(i);
      int char2 = s2.charAt(i);

      if (char1 != char2) {
        difference = char1 - char2;
        break;
      }
    }
    // if either string is a substring of the other string then the difference is
    // the difference in length of the two strings
    if (difference == 0 && (s1.length() != s2.length())) {
      difference = s1.length() - s2.length();
    }

    System.out.println("Comparing lexicographically the strings return : " + difference);

    ip.close();
  }

}
