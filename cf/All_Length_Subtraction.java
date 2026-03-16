package cf;
import java.util.*;
public class All_Length_Subtraction{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr= new int[N];
            int max=Integer.MIN_VALUE;
            int idx=-1;
            for(int i=0;i<N;i++){
                arr[i]= sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                    idx=i;
                }
            }
            int i=idx;
            int j=idx;
          
            while(true){
                for(int k=i;k<=j;k++){
                    arr[k]--;
                }
                boolean expand=false;
                if(i>0 && arr[i-1]==arr[i]){
                    i--;
                    expand=true;
                }
                if(j<N-1 && arr[j]==arr[j+1]){
                    j++;
                    expand=true;
                }
                if(!expand) break;
              
            }

            boolean ok=true;
            for(int k=0;k<N;k++){
                if(arr[k]!=0){
                    ok=false;
                    break;
                }
            }
            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}