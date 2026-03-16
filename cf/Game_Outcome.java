package cf;
import java.util.*;
public class Game_Outcome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int [] row= new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+= arr[i][j];
            }
            row[i]=sum;
        }

        int [] col= new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+= arr[j][i];
            }
            col[i]=sum;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(col[j]>row[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
