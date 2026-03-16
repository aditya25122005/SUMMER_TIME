package cf;

import java.util.Scanner;
import java.util.*;

public class Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int ele= sc.nextInt();
                    map.put(ele,map.getOrDefault(ele, 0)+1);
                }
            }
            
            boolean ans=true;
            for(int item: map.keySet()){
                if(map.get(item)> ((n*n)-n)){
                    ans=false;
                    break;
                }
            }
            if(ans){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
