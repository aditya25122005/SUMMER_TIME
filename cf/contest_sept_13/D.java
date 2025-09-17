package cf.contest_sept_13;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            long sum=0;
            int Odd=0;
            long minOdd = Long.MAX_VALUE;
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]%2==1){
                    Odd++;
                    minOdd=Math.min(minOdd,arr[i]);
                }
            }
            if(Odd==0){
                System.out.println(0);
            }else if(Odd%2==1){
                System.out.println(sum);
            }else{
                System.out.println(sum-minOdd);
            }


        }
    }
}
