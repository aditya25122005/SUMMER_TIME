package Java_3rd_year.Bit_Masking;

public class find_xor_sum_of_all_pairs_and {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2={6,5};
        System.out.println(getXORSum(arr1, arr2));
    }
    public static int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0;
        int xor2=0;
        for(int num:arr1){
            xor1^=num;
        }
        for(int num:arr2){
            xor2^=num;
        }
        return (xor1 & xor2);
    }
}
