package Java_3rd_year.DP;

import java.util.Arrays;

public class knap_sack01 {
    public static void main(String[] args) {
        int[] wt = {1,2,3,2,2};
        int[] val = {8,4,0,5,3};
        int cap=4;
        int [] [] dp= new int[wt.length][cap+1];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(Knapsack(wt, val, cap, 0,dp));
    }
    public static int Knapsack(int[] wt, int[] val, int cap, int idx,int [][]dp){
        if(cap==0 || idx==wt.length){
            return 0;
        }
        if(dp[idx][cap]!=-1){
            return dp[idx][cap];
        }
        int inc=0;
        int exc=0;
        if(cap>=wt[idx]){
            inc= val[idx]+Knapsack(wt, val, cap-wt[idx], idx+1,dp);
        }
        exc=Knapsack(wt, val, cap, idx+1,dp);
        return dp[idx][cap]=Math.max(inc,exc);
    }
}
