package cf;

import java.util.HashMap;
import java.util.Scanner;

public class Same_Differences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            long [] arr = new long[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextLong();
            }
            HashMap<Long,Long> map= new HashMap<>();
            long c=0;
            int ans=0;
            for(int i=0;i<N;i++){
                long diff = arr[i]-i;
                if(map.containsKey(diff)){
                    c+= map.get(diff);
                    map.put(diff,map.getOrDefault(diff,(long)0)+1);
                }
                else{
                    map.put(diff,(long)1);
                }
            }
            System.out.println(c);
        }
    }
}
