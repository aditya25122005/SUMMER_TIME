package cf;
import java.util.*;
public class Helpful_Math {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        List<Integer> ll= new ArrayList<>();
        for(int i=0;i<s.length();i+=2){
            ll.add(s.charAt(i)-'0');
        }
        Collections.sort(ll);
        StringBuilder sb= new StringBuilder();
        for(int num: ll){
            sb.append(num);
            sb.append('+');
        }
        int len= sb.length();
        System.out.println(sb.toString().substring(0,len-1));
    }
}
