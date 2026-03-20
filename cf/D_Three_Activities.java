package cf;

import java.util.Scanner;

public class D_Three_Activities {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int [] a= new int[n];
            int [] b= new int[n];
            int [] c= new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            for(int i=0;i<n;i++) c[i]=sc.nextInt();
            Integer [][][][] dp= new Integer[n][2][2][2];
            System.out.println(Solve(0, a, b, c, 0, 0, 0,dp));
        }
    }
    public static int Solve(int idx, int []a, int[] b, int[] c, int takeA, int takeB, int takeC,Integer[][][][] dp){
        if(idx>=a.length){
            if(takeA==1 && takeB==1 && takeC==1){
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        if(dp[idx][takeA][takeB][takeC]!=null){
            return dp[idx][takeA][takeB][takeC];
        }

        int A=Integer.MIN_VALUE;
        int B= Integer.MIN_VALUE;
        int C= Integer.MIN_VALUE;

        if(takeA==0){
            int next= Solve(idx+1,a,b,c,1,takeB,takeC,dp);
            if(next!=Integer.MIN_VALUE){
                A = a[idx]+next; 
            }
        }
        if(takeB==0){
            int next= Solve(idx+1,a,b,c,takeA,1,takeC,dp);
            if(next!=Integer.MIN_VALUE){
                B = b[idx]+next; 
            }
        }
        if(takeC==0){
            int next= Solve(idx+1,a,b,c,takeA,takeB,1,dp);
            if(next!=Integer.MIN_VALUE){
                C = c[idx]+next; 
            }
        }
        int skip= Solve(idx+1,a,b,c,takeA,takeB,takeC,dp);
        return dp[idx][takeA][takeB][takeC]= Math.max(Math.max(A,B),Math.max(C,skip));

    }
}
