package cf.contest_sept_13;

import java.util.Scanner;

public class two_three_moves {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            if(n==2 || n==3){
                System.out.println(1);
            }
            else if(n==1){
                System.out.println(2);
            }
            else{
                System.out.println((n+2)/3);
            }
        }
    }
}
