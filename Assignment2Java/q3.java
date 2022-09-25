package Assignment2Java;

import java.util.*;

public class q3 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);

    System.out.println("Input Month Number : ");
    int monthNumber = ip.nextInt();

    switch (monthNumber) {
      case 1:
        System.out.println("Name of Month: January");
        System.out.println("Number of Days in Month: 31");
        break;

      case 2:
        System.out.println("Name of Month: February");
        System.out.println("Number of Days in Month: 28/29");
        break;

      case 3:
        System.out.println("Name of Month: March");
        System.out.println("Number of Days in Month: 31");
        break;

      case 4:
        System.out.println("Name of Month: April");
        System.out.println("Number of Days in Month: 30");
        break;

      case 5:
        System.out.println("Name of Month: May");
        System.out.println("Number of Days in Month: 31");
        break;

      case 6:
        System.out.println("Name of Month: June");
        System.out.println("Number of Days in Month: 30");
        break;

      case 7:
        System.out.println("Name of Month: July");
        System.out.println("Number of Days in Month: 31");
        break;

      case 8:
        System.out.println("Name of Month: August");
        System.out.println("Number of Days in Month: 31");
        break;

      case 9:
        System.out.println("Name of Month: September");
        System.out.println("Number of Days in Month: 30");
        break;

      case 10:
        System.out.println("Name of Month: October");
        System.out.println("Number of Days in Month: 31");
        break;

      case 11:
        System.out.println("Name of Month: November");
        System.out.println("Number of Days in Month: 30");
        break;

      case 12:
        System.out.println("Name of Month: December");
        System.out.println("Number of Days in Month: 31");
        break;
    }
  }
}
