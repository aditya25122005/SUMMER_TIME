package Java_3rd_year.Bit_Masking;

public class count_set_bit {
    public static void main(String[] args) {
        int n= 84;
        System.out.println(fast_count(81));
    }
    public static int count_SetBit(int n){  // log(N)
        int ans=0;
        while(n>0){
            if((n&1) ==1){
                ans++;
            }
            n >>=1;  // n= n>>1
        }
        return ans;
    }
    public static int fast_count(int n){
        int ans=0;
        while(n>0){
            ans++;
            n= n&(n-1);
        }
        return ans;
    }
}
