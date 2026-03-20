package cf;

import java.util.*;

public class Boats_Competition{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            if(N<=1){
                System.out.println(0);
            }
            else{
                Arrays.sort(arr);
                int start = arr[1]+arr[0];
                int end = arr[N-1]+arr[N-2];
                int ans=0;
                for(int sum=start;sum<=end;sum++){
                    int i=0;
                    int j=N-1;
                    int c=0;
                    while(i<j){
                        int curr= arr[i]+arr[j];
                        if(curr == sum){
                            c++;
                            i++;
                            j--;
                        }
                        else if(curr<sum){
                            i++;
                        }
                        else{
                            j--;
                        }
                    }
                    ans=Math.max(ans,c);
                }
                System.out.println(ans);
            }
            

        }
           
       
    }
}