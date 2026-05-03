package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayPractise {

  public static void main(String[] args) {
    findLargestElementUsingReduce(Arrays.asList(1, 5, 2, 5, 7, 8, 34));
    secondLargestElement(new int[] { 1, 5, 2, 5, 7, 8, 34 });
    smallestElement(new int[] { 1, 5, 2, 5, 7, 8, 34 });
    sumOfElements(Arrays.asList(1, 5, 2, 5, 7, 8, 34));
    countOddEvenNumbers(new int[] { 1, 2, 3, 4 });
    reverseArray(new int[] { 1, 2, 3, 4, 5 });
    checkElementExists(new int[] { 1, 2, 3, 4, 5 }, 3);
    findIndexOfElement(new int[] { 1, 2, 3, 4, 5 }, 3);
    countDuplicate(new int[] { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 });

  }

  // Using reduce method to find the largest element in the list
  public static void findLargestElementUsingReduce(List<Integer> arr) {
    int largestNum = arr.stream()
        .reduce(0, (max, current) -> current > max ? current : max);
    System.out.println(largestNum);
  }

  public static void findLargestElement(List<Integer> arr) {
    int largestNum = 0;

    for (int i : arr) {
      System.out.println(i);
      if (i > largestNum) {
        largestNum = i;
      }
    }
    System.out.println("Largest element: " + largestNum);
  }

  public static void secondLargestElement(int[] arr) {
    int largestNum = 0;
    int secondLargestNum = 0;

    for (int i : arr) {
      if (i > largestNum) {
        secondLargestNum = largestNum;
        largestNum = i;
      } else if (i > secondLargestNum && i != largestNum) {
        secondLargestNum = i;
      }
    }

    System.out.println("Second largest element: " + secondLargestNum);
  }

  public static void smallestElement(int[] arr) {
    int smallestNum = arr[0];
    for (int i : arr) {
      if (i < smallestNum) {
        smallestNum = i;
      }

    }

    System.out.println("Smallest element: " + smallestNum);

  }

  public static void sumOfElements(List<Integer> arr) {

    int sum = arr.stream()
        .reduce(0, Integer::sum);
    System.out.println("Sum of elements: " + sum);

  }

  public static void countOddEvenNumbers(int[] arr) {

    Map<String, Integer> count = new HashMap<>();
    count.put("even", 0);
    count.put("odd", 0);
    for (int elem : arr) {
      if (elem % 2 == 0) {
        count.put("even", count.get("even") + 1);
      } else {
        count.put("odd", count.get("odd") + 1);
      }
    }

    System.out.println("Count of even is: " + count.get("even") + " and odd is " + count.get("odd"));

  }

  public static void reverseArray(int[] arr) {
    int[] reversedArr = new int[arr.length];
    // Implement a loop that should run from end of array
    for (int i = arr.length - 1; i >= 0; i--) {
      reversedArr[arr.length - 1 - i] = arr[i];
    }
    System.out.print("Reversed array is: ");
    System.out.println(Arrays.toString(reversedArr));
  }

  public static void checkElementExists(int[] arr, int target) {
    boolean exists = false;
    for (int i : arr) {
      if (i == target) {
        exists = true;
        break;
      }
    }
    System.out.println("Element exists: " + exists);
  }

  public static void findIndexOfElement(int[] arr, int target) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        index = i;
        break;
      }
    }
    System.out.println("Index of element: " + index);
  }

  public static void countDuplicate(int[] arr) {
    Map<Integer, Integer> elementCount = new HashMap<>();
    for (int i : arr) {
      elementCount.put(i, elementCount.getOrDefault(i, 0) + 1);
    }
    System.out.println("Count of all elements are: ");
    System.out.println(elementCount);
  }
}

/*
 * ========
 * Beginner
 * ========
 * ==> Find the largest element in an array.
 * ==> Find the second largest element.
 * ==> Find the smallest element.
 * ==> Calculate sum of all elements.
 * ==> Calculate average of array elements.
 * ==> Count even and odd numbers.
 * ==> Reverse the array.
 * ==> Check if an element exists in the array.
 * ==> Find the index of a given element.
 * ==> Count duplicate elements.
 * 
 * ===========
 * Easy-Medium
 * ===========
 * ==> Sort an array in ascending order.
 * ==> Remove duplicate elements from an array.
 * ==> Rotate an array left by k positions.
 * ==> Rotate an array right by k positions.
 * ==> Merge two arrays.
 * ==> Find frequency of each element.
 * ==> Find missing number in a sequence.
 * ==> Find the sum of even numbers and odd numbers separately.
 * ==> Find max and min in one pass.
 * ==> Move all zeroes to the end.
 * 
 * ======
 * Medium
 * ======
 * ==> Find the second smallest element.
 * ==> Find the third largest element.
 * ==> Check if an array is sorted.
 * ==> Find common elements in two arrays.
 * ==> Find the union and intersection of two arrays.
 * ==> Find the subarray with maximum sum.
 * ==> Find the longest consecutive sequence.
 * ==> Find majority element.
 * ==> Find pairs whose sum equals a target.
 * ==> Check if two arrays are equal.
 * ==> Two-dimensional array practice
 * ==> Matrix addition.
 * ==> Matrix subtraction.
 * ==> Matrix multiplication.
 * ==> Transpose of a matrix.
 * ==> Print diagonal elements.
 * ==> Find sum of each row and column.
 * ==> Rotate a matrix by 90 degrees.
 * ==> Check if matrix is symmetric.
 * ==> Find the largest element in each row.
 * ==> Search an element in a matrix.
 * 
 * ===============
 * How to practice
 * Start with:
 * ===============
 * ==> largest element,
 * ==> reverse array,
 * ==> sort array,
 * ==> remove duplicates,
 * ==> rotate array.
 * 
 * =============
 * Then move to:
 * =============
 * ==> subarray problems,
 * ==> frequency counting,
 * ==> 2D arrays.
 * ==> Best learning order
 * ==> Traversal.
 * ==> Condition checking.
 * ==> Sorting.
 * ==> Two-pointer style problems.
 * ==> 2D arrays.
 * ==> Array + HashMap problems.
 */