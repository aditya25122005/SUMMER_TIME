package Java_3rd_year.DP;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        int [][]matrix ={{2,1,3},{6,5,4},{7,8,9}};
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
        if(cc<0 || cc>=matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr==matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
        int ld= Path(matrix, cr+1, cc-1, dp);
        int rd= Path(matrix, cr+1, cc+1, dp);
        int d=Path(matrix, cr+1, cc, dp);
        return dp[cr][cc]=Math.min(rd,Math.min(ld,d))+matrix[cr][cc];
    }
}
