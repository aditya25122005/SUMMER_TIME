package Java_3rd_year.Bit_Masking;

public class magic_number {
    public static void main(String[] args) {
        int n=9;
        System.out.println(Nthnumber(n));
    }
    public static int Nthnumber(int n){
        int mul=5; 
        int ans=0;
        while(n>0){
            if((n&1)==1){
                ans+= mul;
            }
            n >>=1;
            mul=mul*5;
        }
        return ans;
    }
}
