package cf;

import java.util.Scanner;

public class B_Seats {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0) {
            int N= sc.nextInt();
            String s= sc.next();
            char [] arr=s.toCharArray();
            int ans=0;
            if(N==1){
                System.out.println(1);
                
            }
            else{
            for(int i=1;i<N-1;i++){
                if(arr[i]=='1'){
                    ans++;
                    if(arr[i-1]=='0'){
                        arr[i-1]='X';
                    }
                    if(arr[i+1]=='0'){
                        arr[i+1]='X';
                    }
                }
            }
            if(arr[0]=='1'){
                ans++;
                if(N>1 && arr[1]=='0'){
                    arr[1]='X';
                }
            }
            if(arr[N-1]=='1'){
                ans++;
                if(N>1 && arr[N-2]=='0'){
                    arr[N-2]='X';
                }
            }

            int curr=0;
            for(int i=0;i<N;i++){
                if(arr[i]=='0'){
                    curr++;
                    if(curr==3){
                        ans++;
                        curr=0;
                    }
                    
                }
                else{
                    if(curr>0){
                        ans++;
                        curr=0;
                    }
                }
            }
            if(curr>0){
                ans++;
                curr=0;
            }
            System.out.println(ans);
        }
        }
    }
}
