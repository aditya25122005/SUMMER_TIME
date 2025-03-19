package stack;

import java.util.Stack;

public class next_greater_practice {
    public static void main(String[] args) {
        int [] arr={5,11,9,7,13,3};
        NGE(arr);

    }
    public static void NGE(int [] arr){
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
