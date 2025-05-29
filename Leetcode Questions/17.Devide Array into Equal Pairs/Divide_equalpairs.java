public class Divide_equalpairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        boolean result = canFormEqualPairs(nums);
        System.out.println(result); // Output: true
    }
    public static boolean canFormEqualPairs(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        int[] count = new int[101];
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int c : count) {
            if (c % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}
