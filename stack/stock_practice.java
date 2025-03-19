package stack;
import java.util.*;
public class stock_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={3,1,6,4,18,7,5,11,19};
        stock(arr);

    }
    public static void stock(int [] arr){
        int [] ans=new int [arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
                if(st.isEmpty()){
                    ans[i]=i+1;
                }
                else{
                    ans[i]=i-st.peek();
                }
            
            st.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
}