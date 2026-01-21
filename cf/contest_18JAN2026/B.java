package cf.contest_18JAN2026;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int maxE=0;
            int idx=-1;
            for(int i=0;i<n;i++){
                if(arr[i]>maxE){
                    maxE=arr[i];
                    idx=i;
                }
            }
            System.out.println(maxE*n);

        }
    }
}
