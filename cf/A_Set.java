package cf;

import java.util.Scanner;

public class A_Set {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int l= sc.nextInt();
            int r= sc.nextInt();
            int k= sc.nextInt();
            // k*x <=r
           // l<= x<= r/k
            System.out.println(Math.max(0, (r/k)-l+1));

        }
    }
}
