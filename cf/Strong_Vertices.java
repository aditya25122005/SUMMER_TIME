package cf;
import java.util.*;
public class Strong_Vertices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
        int n= sc.nextInt();
        int [] a= new int[n];
        int [] b= new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]= sc.nextInt();
        }
        int [] val= new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            val[i]= a[i]-b[i];
            max=Math.max(max,val[i]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(val[i]==max) count++;
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(val[i]==max){
                System.out.print((i+1)+" ");
            }
        }
        System.out.println();
    }

    }
}
