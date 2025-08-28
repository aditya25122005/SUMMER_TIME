package Java_3rd_year.DP;

public class fibo {
    public static void main(String[] args) {
        int n=5;
        int [] dp= new int[n+1];
        System.out.println(Fib(n,dp));
        System.out.println(FibBU(n));
        

    }
    //TopDown
    public static int Fib(int n, int [] dp){
        if(n==0 || n==1){
            return n;
        }

        if(dp[n]!=0){ // DP apply kara hai
            return dp[n];
        }
        
        int f1= Fib(n-1,dp);
        int f2= Fib(n-2,dp);
        return dp[n]=f1+f2;
    }
    public static int FibBU(int n){
        int [] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1] +dp[i-2];
        }
        return dp[n];
    }
}
