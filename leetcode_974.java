
import java.util.*;
public class leetcode_974 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6};
        int k=5;
        System.out.println(count_subArray(arr,k));
    }
    public static long count_subArray(int [] arr, int k){
        
        long [] freq= new long[k];
        long sum=0;
        freq[0]=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem= (int)(sum%k);
            if(rem<0){
                rem+=arr.length;
            }
            freq[rem]++;
        }
        long ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>2){
                long x= freq[i];
                ans+=(x*(x-1)/2);
            }
        }
        return ans;
    }
}
