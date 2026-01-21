package cf;
import java.util.*;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            int [] A= new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
            }
            HashSet<Integer> hh= new HashSet<>();
            for(int i=0;i<n;i+=2){
                hh.add(A[i]);
            }
            Arrays.sort(A);
            boolean sahi= true;
            for(int i=0;i<n-1;i++){
                if((hh.contains(A[i]) && hh.contains(A[i+1])) || (!hh.contains(A[i]) && !hh.contains(A[i+1]))){
                        sahi=false;
                        break;
                }
            }
            if(sahi){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
