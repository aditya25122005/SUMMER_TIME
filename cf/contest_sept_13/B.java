package cf.contest_sept_13;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            int [] a= new int[n];
            int [] b= new int[m];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            System.out.println(n+m);
        }
    }
}
