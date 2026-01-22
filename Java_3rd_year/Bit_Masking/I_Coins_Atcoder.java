package Java_3rd_year.Bit_Masking;
import java.util.*;
public class I_Coins_Atcoder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        double [] p= new double[N];
        double [][] dp= new double[((N+1)/2)+1][N];
        for(double [] d:dp){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<N;i++){
            p[i]= sc.nextDouble();
        }
        System.out.println(Solve((N+1)/2, p, 0,dp));
    }
    public static double Solve(int h, double [] p, int i, double[][]dp){
        if(h==0){
            return 1;
        }
        if(i==p.length){
            return 0;
        }
        if(dp[h][i]!=-1) return dp[h][i];
        double head= p[i]* Solve(h-1,p,i+1,dp);
        double tail= (double)(1.0-p[i])* Solve(h, p, i+1,dp);

        return dp[h][i] = head+tail;
    }   


}
