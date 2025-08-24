package cf;
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            String a= sc.next();
            int m= sc.nextInt();
            String b=sc.next();
            String c= sc.next();

            Deque<Character> dq= new ArrayDeque<>();
            for(char ch:a.toCharArray()){
                dq.addLast((ch));
            }
            for(int i=0;i<m;i++){
                if(c.charAt(i)=='V'){
                    dq.addFirst(b.charAt(i));
                }
                else{
                    dq.addLast(b.charAt(i));
                }
            }
            StringBuilder ans= new StringBuilder();
            while(!dq.isEmpty()){
                ans.append(dq.pollFirst());
            }
            System.out.println(ans.toString());
        }
        sc.close();
    }
    
}
