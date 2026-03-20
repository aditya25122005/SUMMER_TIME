package cf;
import java.util.*;
public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int n= sc.nextInt();
        int [][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        boolean ans=true;
        for(int i=0;i<n;i++){
            if(arr[i][0]>= s){
                ans=false;
                break;
            }
            else{
                s+=arr[i][1];
            }
        }
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
