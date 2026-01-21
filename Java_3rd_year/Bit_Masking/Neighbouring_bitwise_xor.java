package Java_3rd_year.Bit_Masking;

public class Neighbouring_bitwise_xor {
    public static void main(String[] args) {
        int[] derived={1,1,0};
        System.out.println(doesValidArrayExist(derived));
    }
    public static boolean doesValidArrayExist(int[] derived) {
       int xor=0;
       for(int v:derived){
        xor^=v;
       }
       return xor==0;
    }
}
