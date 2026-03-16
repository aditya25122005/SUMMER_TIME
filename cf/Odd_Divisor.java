package cf;

import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            long n=sc.nextLong();
            String s= String.valueOf(n);
            int N= s.length();
            if(n==2){
                System.out.println("NO");
            }
            else if(s.charAt(N-1)=='0' || s.charAt(N-1)=='5'){
                System.out.println("YES");
            }
            else if(n%2==1 || n%3==0 || n%7==0 || n%11==0  || n%13==0 || n%17==0 || n%19==0){
                System.out.println("YES");
            }
            else if(n%2==0){
                while(n>0 && n%2!=1){
                    n/=2;
                }
                if(n==1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
                
            }
            else{

                System.out.println("NO");
            }

        }
    }
}
