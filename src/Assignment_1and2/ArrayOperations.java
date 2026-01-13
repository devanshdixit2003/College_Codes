package Assignment_1and2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    // ---------- Method to insert element ----------
    public static int[] insert(int[] arr, int size, int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            return arr;
        }

        int[] newArr = new int[size + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        System.out.println("After insertion: " + Arrays.toString(newArr));
        return newArr;
    }

    // ---------- Method to delete element ----------
    public static int[] delete(int[] arr, int size, int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
            return arr;
        }

        int[] newArr = new int[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != position) {
                newArr[j++] = arr[i];
            }
        }
        System.out.println("After deletion: " + Arrays.toString(newArr));
        return newArr;
    }

    // ---------- Linear Search ----------
    public static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found!");
    }

    // ---------- Binary Search (Array must be sorted) ----------
    public static void binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid + " (after sorting)");
                return;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found!");
    }

    // ---------- Find Maximum ----------
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println("Maximum value = " + max);
    }

    // ---------- Count Even and Odd ----------
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count = " + even + ", Odd count = " + odd);
    }

    // ---------- Insertion Sort ----------
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array after insertion sort: " + Arrays.toString(arr));
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int[] arr = new int[0];
        int size = 0;
        int choice;

        do {
            System.out.println("\n===== Array Operations Menu =====");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Find Maximum");
            System.out.println("6. Count Even and Odd");
            System.out.println("7. Insertion Sort");
            System.out.println("8. Display Array");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = dd.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = dd.nextInt();
                    System.out.print("Enter position (0-based index): ");
                    int pos = dd.nextInt();
                    arr = insert(arr, size, element, pos);
                    size = arr.length;
                    break;

                case 2:
                    System.out.print("Enter position to delete (0-based index): ");
                    int delPos = dd.nextInt();
                    arr = delete(arr, size, delPos);
                    size = arr.length;
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key1 = dd.nextInt();
                    linearSearch(arr, key1);
                    break;

                case 4:
                    System.out.print("Enter element to search (binary search): ");
                    int key2 = dd.nextInt();
                    binarySearch(arr, key2);
                    break;

                case 5:
                    if (size > 0) findMax(arr);
                    else System.out.println("Array is empty!");
                    break;

                case 6:
                    if (size > 0) countEvenOdd(arr);
                    else System.out.println("Array is empty!");
                    break;

                case 7:
                    if (size > 0) insertionSort(arr);
                    else System.out.println("Array is empty!");
                    break;

                case 8:
                    System.out.println("Current Array: " + Arrays.toString(arr));
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 9);

        dd.close();
    }
}

