package JPMC;
import java.util.*;
public class copycat {
    public static void main(String[] args) {
        
        String s="abababa";
        int ans=0;
        
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        String s1=new String(arr);
        StringBuilder sb= new StringBuilder(s1);
        String s2=sb.reverse().toString();
        for(int i=0;i<s1.length();i++){
            if(s.charAt(i) != s2.charAt(i)){
                ans++;
            }
        }
        System.out.println(ans);



    }
}
