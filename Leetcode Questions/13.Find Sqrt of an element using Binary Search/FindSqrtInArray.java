import java.util.Arrays;
import java.util.Scanner;

public class FindSqrtInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        System.out.print("Enter the number to find the square root: ");
        double num = sc.nextDouble();

        double sqrt = Math.sqrt(num);

        int index = binarySearch(arr, sqrt);

        if (index != -1) {
            System.out.println("The square root of " + num + " is " + sqrt + " and is found at index " + index + " in the array.");
        } else {
            System.out.println("Square root " + sqrt + " not found in the array.");
        }
        sc.close();
    }
    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(arr[mid] - target) < 1e-6) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
