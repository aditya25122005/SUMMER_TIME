package cf;
import java.util.*;
public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int c=0;
            int i=0;
            while(i<N){
                if(arr[i]!=0){
                    c++;
                    while(i<N && arr[i]!=0){
                        i++;
                    }
                }
                else{
                    i++;
                }
            }
            if(c>1){
                System.out.println(2);
            }
            else{
                System.out.println(c);
            }

            
        }
    }
}
