package stack;

import java.util.Stack;

public class leetcode_2375 {
    public static void main(String[] args) {
        String str="IIIDIDDD";
        System.out.println(construct_smallest(str));

    }
    public static String construct_smallest(String str){
        int []ans=new int[str.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=str.length();i++){
            if(i==str.length() || str.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }

            }
            else{
                st.push(i);
            }
        }
        String s="";
        for(int v:ans){
            s+=v;
        }
        return s;
    }
    
}
