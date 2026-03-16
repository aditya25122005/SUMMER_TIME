package cf;

import java.util.*;

public class Deletion_Sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean ok=true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    ok=false;
                    break;
                }
            }
            if(ok) System.out.println(n);
            else{
                System.out.println(1);
            }
        }
    }
}
