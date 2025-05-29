import java.util.Scanner;
public class Searches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        int linearResult = linearSearch(arr, target);
        int binaryResult = binarySearch(arr, target);
        if (linearResult != -1) {
            System.out.println("Element found at index " + linearResult + " using Linear Search.");
        } else {
            System.out.println("Element not found using Linear Search.");
        }
        if (binaryResult != -1) {
            System.out.println("Element found at index " + binaryResult + " using Binary Search.");
        } else {
            System.out.println("Element not found using Binary Search.");
        }
        scanner.close();
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; 
                right = mid - 1;
            }
        }
        return -1;
    }
}
