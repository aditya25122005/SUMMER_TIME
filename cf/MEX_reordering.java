package cf;
import java.util.*;
public class MEX_reordering {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            
            int [] A= new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            if(Solve(A, n)){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean Solve(int []A, int n){
            boolean res=true;
            int c0=0;
            for(int i=0;i<n-1;i++){
                if(A[i]==c0){
                    c0++;
                }
                int c1=0;
                for(int j=i+1;j<n;j++){
                    if(A[j]==c1){
                        c1++;
                    }
                }
                if(c0==c1){
                    return false;
                }
            }
        return true;
    }
}
