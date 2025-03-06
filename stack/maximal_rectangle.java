package stack;

import java.util.Stack;

public class maximal_rectangle {
    public static void main(String[] args) {
      char ch[][]  = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
      int [] arr= new int [ch[0].length];
      int ans=0;
      for(int i=0;i<ch.length;i++){
        for(int j=0;j<ch[0].length;j++){
            if(ch[i][j]=='0'){
                arr[j]=0;
            }
            else{
                arr[j]++;
            }
        }
        ans=Math.max(ans,Largest_Histogram(arr));
      }
      System.out.println(ans);
    }
    public static int Largest_Histogram(int [] arr){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(h*r,ans);
                }
                else{
                    int l=st.peek();
                    int area= h*(r-l-1);
                    ans=Math.max(ans,area);
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];

            if(st.isEmpty()){
                ans=Math.max(h*r, ans);
            }
            else{
                int l=st.peek();
                int area=h*(r-l-1);
                ans=Math.max(area,ans);
            }
        }
        return ans;
    }
}
