package cf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Kuriyama_Mirais_Stones {
    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);

        int N= sc.nextInt();

        int [] arr= new int[N];

       
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        long [] prefix= new long[N+1];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        Arrays.sort(arr);
        long [] sortedP = new long[N+1];
        for(int i=1;i<sortedP.length;i++){
            sortedP[i]=sortedP[i-1]+arr[i-1];
        }

        int Q= sc.nextInt();
     
        for(int i=0;i<Q;i++){
            
            int type= sc.nextInt();
            int l= sc.nextInt();
            int r= sc.nextInt();
            if(type==1){
                System.out.println(prefix[r+1-1]-prefix[l-1]);
            }
            else{
                System.out.println(sortedP[r+1-1]-sortedP[l-1]);
            }
        }
        // System.out.println(sb);
    }
}
