import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = new int[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 elements for the array:");
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array for binary search (required for binary search)
        Arrays.sort(arr);

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
