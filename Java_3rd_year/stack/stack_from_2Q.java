package Java_3rd_year.stack;
import java.util.*;
public class stack_from_2Q {
     static Queue<Integer> q1= new LinkedList<>();
     static Queue<Integer> q2= new LinkedList<>();
    public static void main(String[] args) {
       stack_from_2Q st= new stack_from_2Q();
       st.push(10);
       st.push(20);
       st.push(30);

       
       System.out.println(st.pop());
       System.out.println(st.peek());

    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp= q1;
        q1=q2;
        q2=temp;
    }
    public int pop(){
        if(q1.isEmpty()){
            throw new NullPointerException("Empty stack");
        }
        return q1.remove();
    }
    public int peek(){
        if(q1.isEmpty()){
            throw new NullPointerException("Empty stack");
        }
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    

    

    
}