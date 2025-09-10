package Java_3rd_year.DP;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
        int [][]matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int ans=Integer.MAX_VALUE;
        int [][] dp= new int[matrix.length][matrix[0].length];
        for(int []a:dp){
            Arrays.fill(a, -66666);
        }
        for(int i=0;i<matrix[0].length;i++){ // i -->col
            ans=Math.min(ans, Path(matrix, 0, i, dp));
        }
        System.out.println(ans);
    }
    public static int Path(int [][] matrix, int cr,int cc, int[][] dp){
        if(cr==matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            if(i==cc){
                continue;
            }
            ans=Math.min(ans,Path(matrix,cr+1,i,dp));
        }
        return dp[cr][cc]=ans+matrix[cr][cc];
    }
}
