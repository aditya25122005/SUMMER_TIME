package Java_3rd_year.DP;
public class Coin_Change_II {
    public static void main(String[] args) {
        int amount=5;
        int[] coins={1,2,5};
        int [][] dp= new int[amount+1][coins.length];
        for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
        // System.out.println(Coin_Change(coins, 0, amount,dp));
        System.out.println(Coin_Change_BU(coins, amount));
    }
    public static int Coin_Change(int[] coins,int i, int amount, int[][] dp){
        if(amount==0){
            return 1;
        }
        if(i==coins.length){
            return 0;
        }
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int inc=0;
        int exc=0;
        if(amount>=coins[i]){
            inc=Coin_Change(coins, i, amount-coins[i],dp);
        }
        exc=Coin_Change(coins, i+1, amount,dp);
        return dp[amount][i]=inc+exc;
    }
    public static int Coin_Change_BU(int []coins, int amount){
        int[][] dp= new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        int inc =0, exc=0;
        for(int i=1;i<dp.length;i++){
            for(int am=1;am<dp[0].length;am++){
                
                if(am >= coins[i-1]){
                    inc=dp[i][am-coins[i-1]];
                }
                exc=dp[i-1][am];
                dp[i][am]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
                                                                    