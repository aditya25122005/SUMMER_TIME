package cf;
import java.util.Scanner;

public class Physicst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int A=0;
        int B=0;
        int C=0;
        while(n-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            A+=a;
            B+=b;
            C+=c;
        }
        if(A==0 && B==0 && C==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");   
        }
    }
}
