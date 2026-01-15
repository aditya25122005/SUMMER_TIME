package Java_3rd_year.Bit_Masking;
import java.util.*;
public class Preparing_Olympiad_CF_550_B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int l= sc.nextInt();
        int r= sc.nextInt();
        int x= sc.nextInt();
        int [] C= new int[n];
        for(int i=0;i<n;i++){
            C[i]= sc.nextInt();
        }
        int ways=0;

        
        for(int i=3; i< 1<<n ; i++){
            int num=i;
            int setBit=0;
            while(num!=0){
                num= num&(num-1);
                setBit++;
            }
            if(setBit>=2){
                if(isValid(i,l,r,x,C)){
                    ways++;
                }
            }
            
        }
        System.out.println(ways);

    }
    public static boolean isValid(int i, int l, int r, int x, int [] C){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int idx=0;
        while(i>0){
            if((i&1)==1){
                sum+= C[idx];
                min=Math.min(min,C[idx]);
                max=Math.max(max,C[idx]);
            }
            i>>=1;
            idx++;
        }
        if(sum>=l && sum<=r && (max-min)>=x){
            return true;
        }
        return false;
    }
}
