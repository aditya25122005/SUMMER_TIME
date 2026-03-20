package cf;
import java.util.*;
public class Maximum_In_Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [][] arr= new int[n][n];
        for(int j=0;j<n;j++){
            arr[0][j]=1;
            arr[j][0]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
