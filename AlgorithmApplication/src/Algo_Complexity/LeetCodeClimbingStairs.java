package Algo_Complexity;

public class LeetCodeClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbWays(10));
    }

    public static int climbWays(int n) {
        //here you precise the base cases
        if(n<3) return n;
        int[] dp = new int[n+1];
        //initialize the dp table
        dp[0]=0;//dont forget to initialize your dp table and after setting the base cases
        dp[1] =1;
        dp[2]=2;
        for(int i =3; i<=n; i++)// take not of the <= sign
        {
            dp[i] =dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
