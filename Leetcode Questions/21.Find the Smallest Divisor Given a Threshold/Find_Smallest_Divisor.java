public class Find_Smallest_Divisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int result = smallestDivisor(nums, threshold);
        System.out.println(result);
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(nums, mid, threshold)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
    private static boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum <= threshold;
    }
}

