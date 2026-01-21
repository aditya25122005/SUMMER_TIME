package cf.contest_18JAN2026;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxCon=1;
            int curr=1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    continue;
                }
                if(arr[i]==arr[i-1]+1){
                    curr++;
                }
                else{
                    maxCon=Math.max(maxCon,curr);
                    curr=1;
                }
            }
            maxCon=Math.max(maxCon,curr);
            System.out.println(maxCon);
        }
    }
}
