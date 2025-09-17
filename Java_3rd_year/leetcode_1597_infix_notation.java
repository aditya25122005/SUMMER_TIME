package Java_3rd_year;
import java.util.*;
public class leetcode_1597_infix_notation {
    class Node {
        Node root;
        Node left;
        Node right;
        int val;
        Node(int v){
            this.val=v;
        }
    }
    public static void main(String[] args) {
        String s = "3*4-2*5";
        
        
    }
    public Node expTree(String s){
        String PostFix=getPostFix(s);
        Stack<Node> st = new Stack<>();
        for(int i=0;i<PostFix.length();i++){
            char ch= PostFix.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                Node nn= new Node(ch);
                Node right=st.pop();
                Node left=st.pop();
                nn.right=right;
                nn.left=left;
                st.push(nn);
            }else{
                st.push(new Node(ch));
            }
        }
        return st.peek();
    }
    public String getPostFix(String s){
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='0' && ch<='9'){
                sb.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }
            else{//Operator
                while(!st.isEmpty() && getValue(st.peek())>=getValue(ch)){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();


    }
    public int getValue(char ch){
        if(ch=='*' || ch=='/'){
            return 2;
        }
        else if(ch=='-' || ch=='+'){
            return 1;
        }else{
            return -1;
        }
    }
}
