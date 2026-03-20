package cf;
import java.util.*;
public class Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int opr=0;
            boolean ans=true;
            int i=N-2;
            while(i>=0){
                while(arr[i]>=arr[i+1] && arr[i]>0){
                    arr[i]/=2;
                    opr++;
                }
                if(arr[i]>=arr[i+1]){
                   ans=false;
                   break;
                }
                i--;
            }
            if(!ans){
                System.out.println("-1");
            }
            else{
                System.out.println(opr);
            }
        }
    }
}
