package cf;

import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }

            boolean ok=true;
            for(int i=0;i<n-1;i++){
                int curr = Math.abs(arr[i]-arr[i+1]);
                if(curr==5 || curr==7){
                    continue;
                }
                else{
                    ok=false;
                    break;
                }
            }
            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
