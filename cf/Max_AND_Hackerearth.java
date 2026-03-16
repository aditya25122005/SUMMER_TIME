package cf;
import java.util.*;
public class Max_AND_Hackerearth {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int [] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }

        int max=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int curr= arr[i]& arr[j];
                max=Math.max(max,curr);
            }
        }
        System.out.println(max);
    }
}
