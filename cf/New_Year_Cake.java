package cf;
import java.util.*;
public class New_Year_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int curr=1;
            int ht=0;
            int A=a;
            int B=b;
            
            int prev = 0;
            // 0-> black
            // 1-> white
            int ans=0;
            while(a>=curr || b>=curr){
                if(prev==0 && a>=curr){
                    ht++;
                    a-=curr;
                    curr*=2;
                    prev=1;
                }
                else if(prev==1 && b>=curr){
                    ht++;
                    b-=curr;
                    curr*=2;
                    prev=0;
                }
                else{
                    break;
                }
                
            }
            ans=Math.max(ans,ht);
            ht=0;
            a=A;
            b=B;
            prev=1;
            curr=1;

            while(a>=curr || b>=curr){
                if(prev==0 && a>=curr){
                    ht++;
                    a-=curr;
                    curr*=2;
                    prev=1;
                }
                else if(prev==1 && b>=curr){
                    ht++;
                    b-=curr;
                    curr*=2;
                    prev=0;
                }
                else{
                    break;
                }
                
            }
            ans=Math.max(ans,ht);
            System.out.println(ans);

        }

    }
}
