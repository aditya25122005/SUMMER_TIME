package cf;
import java.util.*;
public class Simons_and_Making_It_Beautiful {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int maxIdx=-1;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    maxIdx=i;
                }
            }
            int temp=arr[0];
            arr[maxIdx]=temp;
            arr[0]=max;
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
