package cf;

import java.util.HashMap;
import java.util.Scanner;

public class Find_and_replace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            String s= sc.next();
            StringBuilder sb= new StringBuilder();
            HashMap<Character,Integer> map= new HashMap<>();
            int prev=0;
            for(char ch: s.toCharArray()){
                if(map.containsKey(ch)){
                    sb.append(map.get(ch));
                    prev=map.get(ch);
                }
                else{
                    if(prev==0){
                        sb.append(1);
                        map.put(ch,1);
                        prev=1;
                    }
                    else{
                        sb.append(0);
                        map.put(ch,0);
                        prev=0;
                    }
                    
                }
            }
            boolean ok=true;
            String str= sb.toString();

            for(int i=1;i<str.length();i++){
                if(str.charAt(i)==str.charAt(i-1)){
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
