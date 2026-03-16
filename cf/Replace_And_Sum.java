package cf;

import java.util.Scanner;

public class Replace_And_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int Q= sc.nextInt();
            int [] a= new int[N];
            int [] b= new int[N];
            for(int i=0;i<N;i++){
                a[i]= sc.nextInt();
            }
            for(int i=0;i<N;i++){
                b[i]= sc.nextInt();
            }
            for(int i=0;i<N;i++){
                a[i]=Math.max(a[i],b[i]);
            }
            int max=a[N-1];
            for(int i=N-2;i>=0;i--){
                if(a[i]<max){
                    a[i]=max;
                }
                else{
                    max=a[i];
                }
            }

            int [] pre= new int[N+1];
            for(int i=1;i<pre.length;i++){
                pre[i]=pre[i-1]+a[i-1];
            }

            for(int i=0;i<Q;i++){
                int l= sc.nextInt()-1;
                int r= sc.nextInt()-1;
                int sum = pre[r+1]-pre[l];
                System.out.print(sum+" ");
            }   
            System.out.println();    
        }
    }
}
