import java.util.*;
public class A_Candles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int ans=a;
        while(a>=d){
            ans+=a/d;
            a=a/d + a%d;
        }
        System.out.println(ans);
    }

}