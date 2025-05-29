import java.util.Scanner;
public class Position_of_target_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value to find its starting and ending position: ");
        int target = scanner.nextInt();
        int[] result = findStartAndEndPosition(arr, target);
        if (result[0] != -1) {
            System.out.println("Starting position of target value " + target + " is: " + result[0]);
            System.out.println("Ending position of target value " + target + " is: " + result[1]);
        } else {
            System.out.println("Target value " + target + " not found in the array.");
        }
    }
    public static int[] findStartAndEndPosition(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirstPosition(arr, target);
        result[1] = findLastPosition(arr, target);
        return result;
    }
    public static int findFirstPosition(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int firstPosition = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstPosition = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPosition;
    }
    public static int findLastPosition(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int lastPosition = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastPosition = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastPosition;
    }
}
