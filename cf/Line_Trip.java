package cf;
import java.util.*;
public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int x= sc.nextInt();

            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(i==0){
                    max=Math.max(max,arr[i]-0);
                }
                else{
                    max=Math.max(max,arr[i]-arr[i-1]);
                }
            }
            max=Math.max(max,2*(x-arr[n-1]));
            System.out.println(max);
        }
    }
}
