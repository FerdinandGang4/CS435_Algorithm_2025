package Algo_Complexity;

public class LeetcodeROB {
    public static void main(String[] args) {
        int [] h ={9,6,7,8,22};
        System.out.println(rob(h));
    }

    public static  int rob(int [] houses)
    {
        if(houses.length ==1) return houses[0];
        int[] dp = new int[houses.length+1];
        dp[0]=houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for(int i =2; i<houses.length; i++)
        {
            int rob =houses[i] + dp[i-2];//carefull at this point not to confuse dp with houses
            int notRob =houses[i-1];
            dp[i] = Math.max(rob,notRob);
        }

        return dp[houses.length-1];
    }
}
