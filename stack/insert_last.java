package stack;

import java.util.Stack;

import OOPS.student;

public class insert_last {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        
        int item=500;
        System.out.println(st);
        insert_last(st,5);
        insert_last(st,4);
        insert_last(st,2);
        System.out.println(st.pop());

        System.out.println(st);
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
