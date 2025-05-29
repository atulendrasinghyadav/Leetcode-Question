
import java.util.Scanner;

public class Move_Zeroes {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = Scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);
        
        moveZeroes(arr);
        
        System.out.println("Array after moving zeroes to the end:");
        printArray(arr);

        Scanner.close();
    }
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        
        while (j < n) {
            arr[j++] = 0;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }  
}
