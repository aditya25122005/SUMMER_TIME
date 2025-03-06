package stack;

import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        reverse(st);
        insert_last(st, x);

    }
    public static void insert_last(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        insert_last(st,item);
        st.push(x);
        
    }
}
