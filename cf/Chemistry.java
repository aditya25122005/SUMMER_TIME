package cf;
import java.util.*;
public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            String s= sc.next();
            HashMap<Character,Integer> map= new HashMap<>();
            for(char ch: s.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            // No. of characters with Odd occurence should not be greater than 1 For a String being Palindrome
            // if we can delete k chars then No. of characters with Odd occurence should not be greater than k+1
            int count=0;
            for(char key: map.keySet()){
                int val= map.get(key);
                if(val%2!=0){
                      count++;
                }
            }
            if(count > k+1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }

    }
}
