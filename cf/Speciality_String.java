package cf;
import java.util.*;
public class Speciality_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            String s= sc.next();
            Stack<Character> st= new Stack<>();
            for(char ch: s.toCharArray()){
                if(!st.isEmpty() && st.peek()==ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            if(st.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
