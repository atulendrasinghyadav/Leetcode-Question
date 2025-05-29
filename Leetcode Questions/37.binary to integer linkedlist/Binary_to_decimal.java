import java.util.*;
public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of bits of binary no.: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the binary no.: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr, n);

        int decimal = 0;
        for(int i=0; i<n; i++){
            decimal += arr[i] * Math.pow(2, n-i-1);
        }
        System.out.println("Decimal no. is: " + decimal);
    }
    public static void printArray(int[] arr, int n) {
        System.out.print("Binary no. is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}