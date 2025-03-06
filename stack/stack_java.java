package stack;

import java.util.Stack;

public class stack_java {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.size();
        System.out.println(st.pop()); 
        
        System.out.println(st.peek());
        st.addLast(45);
        System.out.println(st);

        // System.out.println(st.capacity()); //10
        Stack<Integer> st2=new Stack<>();
        st2.push(10);
        st2.push(20);
        st2.push(30);
        st2.push(40);
        System.out.println(st2);
        add_last(st2, 500);
        System.out.println(st2);
        reverse(st2);
        System.out.println(st2);

         

    }
    public static void add_last(Stack<Integer> st2, int item){
        if(st2.isEmpty()){
            st2.push(item);
            return;
        }
        int x=st2.pop();
        add_last(st2, item);
        st2.push(x);
    }
    public static void reverse(Stack<Integer> st2){
        if(st2.isEmpty()){
          
            return;
        }
        int x=st2.pop();
        reverse(st2);
        add_last(st2,x);
    }
    
}
