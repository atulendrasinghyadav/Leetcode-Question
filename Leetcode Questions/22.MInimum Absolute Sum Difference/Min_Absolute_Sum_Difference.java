import java.util.Arrays;
public class Min_Absolute_Sum_Difference {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 6};
        int result = minAbsoluteSumDifference(nums1, nums2);
        System.out.println(result);
    }
    public static int minAbsoluteSumDifference(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long totalDiff = 0;
        for (int i = 0; i < n; i++) {
            totalDiff += Math.abs(nums1[i] - nums2[i]);
        }

        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);

        long maxReduction = 0;
        for (int i = 0; i < n; i++) {
            int target = nums2[i];
            int closestIndex = findClosestIndex(sortedNums1, target);
            long currentDiff = Math.abs(nums1[i] - target);
            long newDiff = Math.abs(sortedNums1[closestIndex] - target);
            maxReduction += currentDiff - newDiff;
        }

        return (int) ((totalDiff - maxReduction) % 1000000007);
    }
    private static int findClosestIndex(int[] sortedNums, int target) {
        int left = 0;
        int right = sortedNums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sortedNums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
