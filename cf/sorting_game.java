package cf;
import java.util.*;
public class sorting_game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            String s= sc.next();
            char [] arr= s.toCharArray();

            Solve(arr);

        }
    }
    public static void Solve(char [] arr){
        int n= arr.length;
        int zero=0;
        int one=0;
        for(char ch:arr){
            if(ch=='0') zero++;
            if(ch=='1') one++;
        }
        char [] newArr= new char [n];
        int idx=0;
        while(zero!=0){
            newArr[idx++]='0';
            zero--;
        }
        while(one!=0){
            newArr[idx++]='1';
            one--;
        }
        boolean ans=false;
        int m=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            if(newArr[i]!=arr[i]){
                ans=true;
                sb.append(i+1);
                sb.append(" ");
                m++;
            }
        }
        if(ans==false){
            System.out.println("Bob");
            return;
        }
        System.out.println("Alice");
        System.out.println(m);
        System.out.println(sb);

    }
}
