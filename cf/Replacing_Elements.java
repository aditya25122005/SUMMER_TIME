package cf;

import java.util.*;

public class Replacing_Elements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int d= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int min1=arr[0];
            int min2=arr[1];
            if(Solve(arr, d, min1, min2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
    public static boolean Solve(int [] arr, int d, int min1, int min2){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>d){
                if(min1+min2>d){
                    return false;
                }
            }
        }
        return true;
    }
}
