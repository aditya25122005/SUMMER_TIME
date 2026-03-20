package cf;
import java.util.*;
public class Good_Pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            if(n<=1){
                System.out.println("1 1");
                
            }
            else{
            int [] A= arr.clone();
            Arrays.sort(A);
            int max=A[0];
            int min=A[n-1];
            long a=-1;
            long b=-1;
            for(int i=0;i<n;i++){
                if(arr[i]==min){
                    a=i;
                }
                if(arr[i]==max){
                    b=i;
                }
                if(a!=-1 && b!=-1){
                    break;
                }
            }
            a+=1;
            b+=1;
            System.out.println(b+" "+a);
        }
        }
    }
}
