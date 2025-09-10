package cf.contest_sept_7;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int k= sc.nextInt();
            int x= sc.nextInt();
            for (int i = 0; i < k; i++) {
                x *= 2;
            }
            System.out.println(x);
        }
    }
}
