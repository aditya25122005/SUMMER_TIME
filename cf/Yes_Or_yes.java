package cf;
import java.util.*;
public class Yes_Or_yes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            String s= sc.next();
            int n= s.length();
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='Y'){
                    c++;
                }
            }
            if(c<=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
