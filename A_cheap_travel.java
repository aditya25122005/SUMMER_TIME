import java.util.Scanner;

public class A_cheap_travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int costa=n*a;
        int total=0;
        total=Math.min(costa, (n/m)*b + Math.min((n%m)*a ,b));
        System.out.println(total);

    }


    
}
