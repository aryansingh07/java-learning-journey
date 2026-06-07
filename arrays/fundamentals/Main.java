package arrays.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printMenu();

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter the size for the array.");
                int size1 = sc.nextInt();
                System.out.println("Enter" + size1 + "elements.");
                int[] arr1 = readArray(sc, size1);
                System.out.println("Largest Element: " + LargestElement.largestElement(arr1));
                break;

            case 2:
                System.out.println("Enter the size for the array.");
                int size2 = sc.nextInt();
                System.out.println("Enter" + size2 + "elements.");
                int[] arr2 = readArray(sc, size2);
                System.out.println("Second Largest Element: " + SecondLargestElement.secondLargestElement(arr2));
                break;

            case 3:
                System.out.println("Enter the size for the array.");
                int size3 = sc.nextInt();
                System.out.println("Enter" + size3 + "elements.");
                int[] arr3 = readArray(sc, size3);
                System.out.println("Smallest Element: " + SmallestElement.smallestElement(arr3));
                break;

            case 4:
                System.out.println("Enter the size for the array.");
                int size4 = sc.nextInt();
                System.out.println("Enter" + size4 + "elements.");
                int[] arr4 = readArray(sc, size4);
                System.out.println("Sum of Array Elements: " + SumOfArrayElements.arraySum(arr4));
                break;

            case 5:
                System.out.println("Enter the size for the array.");
                int size5 = sc.nextInt();
                System.out.println("Enter" + size5 + "elements.");
                int[] arr5 = readArray(sc, size5);
                System.out.println("Reversed Array: " + Arrays.toString(ReverseArray.reversedArray(arr5, 0, arr5.length - 1)));
                break;

            case 6:
                System.out.println("Enter the size for the array.");
                int size6 = sc.nextInt();
                System.out.println("Enter" + size6 + "elements.");
                int[] arr6 = readArray(sc, size6);
                System.out.println("Odd and Even Elements: " + Arrays.toString(EvenAndOddElementsInArray.countOddEvenElements(arr6)));
                break;

            case 7:
                System.out.println("Enter the size for the array.");
                int size7 = sc.nextInt();
                System.out.println("Enter" + size7 + "elements.");
                int[] arr7 = readArray(sc, size7);
                if (CheckSortedArray.isArraySorted(arr7))   System.out.println("Given Array is Sorted.");
                else System.out.println("Given Array is not sorted.");
                break;

            case 8:
                System.out.println("Enter the size for the array.");
                int size8 = sc.nextInt();
                System.out.println("Write the element's whose frequency to count.");
                int n = sc.nextInt();
                System.out.println("Enter" + size8 + "elements.");
                int[] arr8 = readArray(sc, size8);
                System.out.println("Frequency of " +n +"Element in the Array: " + CountFrequencyOfElement.countFrequency(arr8, n));
                break;

            case 9:
                System.out.println("Enter the size for the array.");
                int size9 = sc.nextInt();
                System.out.println("Enter" + size9 + "elements.");
                int[] arr9 = readArray(sc, size9);
                System.out.println("Minimum and Maximum Element: " + MinMaxElements.minMax(arr9));
                break;

            case 10:
                System.out.println("Enter the size for the array.");
                int size10 = sc.nextInt();
                System.out.println("Enter" + size10 + "elements.");
                int[] arr10 = readArray(sc, size10);
                System.out.println("Moved Zeros to the End: " + Arrays.toString(MoveZerosToEnd.pushZerosToEnd(arr10)));
                break;

            case 11:
                System.out.println("Enter the size for the array.");
                int size11 = sc.nextInt();
                System.out.println("Which element to search in the array?");
                int search = sc.nextInt();
                System.out.println("Enter" + size11 + "elements.");
                int[] arr11 = readArray(sc, size11);
                System.out.println("Element " +search+ " was at  '" + LinearSearch.linearSearch(arr11, search) + "th' index.");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    private static int[] readArray(Scanner sc, int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    private static void printMenu() {
        String[] options = {
                "1: Largest Element in the Array.",
                "2: Second Largest Element in the Array.",
                "3: Smallest Element in the Array.",
                "4: Sum of Elements in the Array.",
                "5: Reversed Array.",
                "6: Odd and Even Elements in the Array.",
                "7: Check if Sorted Array.",
                "8: Count Frequency of Element in the Array.",
                "9: Minimum and Maximum Element in the Array.",
                "10: Move Zeros in the end in the Array.",
                "10: Linear Search Element in the Array."
        };
        System.out.println("===== Array Fundamentals =====");

        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("/nEnter your choice: ");
    }
}
