package Java_3rd_year;
import java.util.*;
public class Agressive_Cows {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=0;t<T;t++){
        int N= sc.nextInt();
        int C=sc.nextInt();

        int [] stall= new int[N];
        for(int i=0;i<N;i++){
            stall[i]= sc.nextInt();
        }
        Arrays.sort(stall);
        int lo=stall[0];
        int hi= stall[stall.length-1]-stall[0]; //8
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(stall,mid,C)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(ans);
    }


    }
    public static boolean isPossible(int[] arr, int gap, int C){
        int cow=1;
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev>= gap){
                prev=arr[i];
                cow++;
                if(cow>=C){
                    return true;
                }
            }
        }
        return false;
    }

}
