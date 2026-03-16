package cf;
import java.util.*;
public class Wow_Factor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int N= s.length();
        long ans=0;
        long total=0;

        for(int i=1;i<N;i++){
            if(s.charAt(i)=='v' && s.charAt(i-1)=='v'){
                total++;
            }
        }
        long curr=0;
        for(int i=1;i<N;i++){
            if(s.charAt(i)=='v'&& s.charAt(i-1)=='v'){
                curr++;
            }
            if(s.charAt(i)=='o'){
                ans+= (total-curr)*curr;
            }
        }
        System.out.println(ans);
    }
}
