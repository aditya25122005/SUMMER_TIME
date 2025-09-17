package cf.contest_sept_13;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int x=sc.nextInt();
            int n= sc.nextInt();
            if(n%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(x);
            }
        }
    }
}
