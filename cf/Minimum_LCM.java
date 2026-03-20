package cf;

import java.util.Scanner;

public class Minimum_LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int a=1;
            if(n%2==0){
                System.out.println(n/2+" "+n/2);
            }
            else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    a=n/i;
                    break;
                }
            }
            System.out.println(a+" "+(n-a));
            }
        }
    }

}
