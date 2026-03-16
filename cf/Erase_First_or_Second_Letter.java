package cf;

import java.util.*;

public class Erase_First_or_Second_Letter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            String s= sc.next();
            HashSet<Character> hh= new HashSet<>();
            HashMap<Character,Integer> map= new HashMap<>();
            int uniq=0;
            int count=0;
            for(int i=0;i<n;i++){
                char ch= s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)==1) uniq++;
                count+= uniq;

            }
            System.out.println(count);


        }
    }
}
