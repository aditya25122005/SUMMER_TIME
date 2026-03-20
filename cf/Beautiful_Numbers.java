package cf;

import java.util.*;

public class Beautiful_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            String s= sc.next();
            HashMap<Character,Integer> map= new HashMap<>();
            for(char ch: s.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            int max=0;
            for(char key: map.keySet()){
                int val=map.get(key);
                max=Math.max(max,val);
            }
            System.out.println(s.length()-max);

        }
    }
}
