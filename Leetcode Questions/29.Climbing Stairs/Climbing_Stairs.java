public class Climbing_Stairs {
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: 1 way to stay at the ground
        dp[1] = 1; // Base case: 1 way to climb 1 stair

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Ways to reach the ith stair
        }

        return dp[n];
    }
}
