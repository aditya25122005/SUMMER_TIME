package stack;
import java.util.*;
public class next_greater_element {
    public static void main(String[] args) {
        int [] arr={50,5,3,2,8,7,9,11,3};
        NGE(arr);

    }
    public static void NGE(int [] arr){
        int [] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]> arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }


    }
}
