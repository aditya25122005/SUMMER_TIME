package cf;
import java.util.*;
public class Mainik_And_Arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int ans= arr[N-1]-arr[0];
            for(int i=1;i<N;i++){
                ans=Math.max(ans,arr[i]-arr[0]);
            }
            for(int i=0;i<N-1;i++){
                ans=Math.max(ans,arr[N-1]-arr[i]);
                ans=Math.max(ans,arr[i]-arr[i+1]);
            }
            System.out.println(ans);
        }
    }
}
