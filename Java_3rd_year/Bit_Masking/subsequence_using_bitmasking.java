package Java_3rd_year.Bit_Masking;

public class subsequence_using_bitmasking {
    public static void main(String[] args) {
        String s="abc";
        int n=s.length();
        for(int i=0;i< (1<<n);i++){
            Print(s,i);
        }
    }
    public static void Print(String s, int i){
        int idx=0;
        while(i>0){
            if((i&1) ==1 ){
                System.out.print(s.charAt(idx));
                idx++;
            }
            else{
                idx++;
            }
            i>>=1;
        }
        System.out.println();
    }
}
