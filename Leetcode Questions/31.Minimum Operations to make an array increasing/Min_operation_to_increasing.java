public class Min_operation_to_increasing {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        System.out.println("Minimum operations to make the array increasing: " + minOperations(arr));
    }
    public static int minOperations(int[] arr) {
        int n = arr.length;
        int operations = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                operations += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }
        return operations;
    }
}
