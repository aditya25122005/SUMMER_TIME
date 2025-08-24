package cf;
import java.util.*;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            long n= sc.nextLong();
            List<Long> ans= new ArrayList<>();
            long p=10;
            for(int k=1;k<=18;k++){
                long d= p+1;
                if(d!=0 && n%d==0){
                    ans.add(n/d);
                }
                if(k<18) p*=10;
            }
            if(ans.isEmpty()){
                System.out.println(0);
            }
            else{
                Collections.sort(ans);
                System.out.println(ans.size());
                for(int i=0;i<ans.size();i++){
                    if(i>0) System.out.print(" ");
                    System.out.print(ans.get(i));
                }
                System.out.println();
            }

        }
        sc.close();
    }
}
