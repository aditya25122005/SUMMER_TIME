package cf;
import java.util.*;
public class Eating_Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int []a = new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                max=Math.max(max,a[i]);
            }
            int c=0;
            for(int num: a){
                if(num==max){
                    c++;
                }
            }
            System.out.println(c);

        } 
    }
}
