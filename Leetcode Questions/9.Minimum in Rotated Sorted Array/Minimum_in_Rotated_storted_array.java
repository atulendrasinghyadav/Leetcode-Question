import java.util.Scanner;
public class Minimum_in_Rotated_storted_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the rotated sorted array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minIndex = findMinIndex(arr);
        if (minIndex != -1) {
            System.out.println("The minimum element in the rotated sorted array is: " + arr[minIndex]);
        } else {
            System.out.println("Array is empty or not valid.");
        }
        scanner.close();
    }
    public static int findMinIndex(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}