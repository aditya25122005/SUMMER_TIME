package stack;
import java.util.*;
public class leetcode_277 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        celebrity(arr);
    }
    public static int celebrity(int [][] arr){
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int candidate =st.pop();
        for(int i=0;i<arr.length;i++){
            if(i==candidate){
                continue;
            }
            if(arr[candidate][i]==1){
                return -1;
            }
        }
        

    }
    
}
