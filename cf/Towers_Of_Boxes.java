package cf;
import java.util.*;
public class Towers_Of_Boxes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int w= sc.nextInt();
            int d= sc.nextInt();
            if(d<w){
                System.out.println(n);
            }
            else{
                int tower=0;
                int curr=0;

                while(n>0){
                    int stack = d/w;
                    int ht= stack+1;
                    n-=ht;
                    tower++;
                }
                System.out.println(tower);
            }

            
        }
    }   
}
