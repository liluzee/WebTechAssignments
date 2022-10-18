package MISC.Assignment3Java;

import java.util.Scanner;

public class q2 {
  public static void main(String[] args) {

    // The basic idea for count sort is since we have a limited range to which the
    // elements belong to, we simply store the count how many times a certain
    // element appears in a count array and using that count array it is pretty
    // straightforward to achieve the sorted array using a linear traversal.

    Scanner s = new Scanner(System.in);

    System.out.println("Input size of array: ");
    int size = s.nextInt();

    int arr[] = new int[size];

    // Taking a count array (array numbers are in range 0-20) to store the count of
    // each number in our input array.
    int count[] = new int[21];

    System.out.println("Input the array elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();
      count[arr[i]]++;
    }

    // Modify the count array such that each element at each index stores the sum of
    // previous counts
    for (int i = 1; i < 21; i++) {
      count[i] += count[i - 1];
    }

    int k = size - 1;
    int ansArray[] = new int[size];

    // Iterate array arr and copy the element i at its correct position
    // count[arr[k]] - 1 according to count array in sortedArray
    // After placing each element at its correct position, decrease its count by
    // one.
    while (k >= 0) {
      ansArray[count[arr[k]] - 1] = arr[k];
      count[arr[k]] -= 1;
      k -= 1;
    }

    System.out.println("The final sorted array is : ");
    for (int i = 0; i < size; i++) {
      System.out.print(ansArray[i] + " ");
    }

    s.close();
  }
}
