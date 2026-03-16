package cf;
import java.util.*;
public class Three_Indices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<N;i++){
                arr[i]= sc.nextInt();
            }
            boolean ans=false;
            int a=0;
            int b=0;
            int c=0;
            for(int j=1;j<N-1;j++){
                int curr=arr[j];
                int left=-1;
                int right=-1;
                for(int i=j-1;i>=0;i--){
                    if(arr[i]<curr){
                        left=i;
                        break;
                    }
                }
                if(left==-1) continue;

                for(int k=j+1;k<N;k++){
                    if(curr>arr[k]){
                        right=k;
                        break;
                    }
                }
                if(left!=-1 && right!=-1){
                    ans=true;
                    System.out.println("YES");
                    System.out.println((left+1)+" "+(j+1)+" "+(right+1));
                    break;
                }
            }
            if(!ans){
                System.out.println("NO");
            }
          
        }
    }
    
}
