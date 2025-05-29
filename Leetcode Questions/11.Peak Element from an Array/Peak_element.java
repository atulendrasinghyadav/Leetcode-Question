import java.util.Scanner;
public class Peak_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int peakIndex = findPeakElement(arr);
        if (peakIndex != -1) {
            System.out.println("Number of peak elements found: " + peakIndex);
        } else {
            System.out.println("No peak element found.");
        }
    }
    public static int findPeakElement(int[] arr) {
        int count = 0;
        if (arr.length == 0) {
            return -1;
        }
        else{
            for (int i = 1; i < arr.length-1; i++) {
                if ((arr[i] >= arr[i - 1]) && (arr[i] >= arr[i + 1])) {
                    count++;
                }
            }
        }
        return count;
    }
}
