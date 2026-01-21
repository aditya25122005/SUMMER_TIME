package Java_3rd_year.Bit_Masking;

public class bitwise_xor_of_all_pairings {
    public static void main(String[] args) {
        int [] nums1={2,1,3};
        int []nums2={10,2,5,0};
        System.out.println(xorAllNums(nums1, nums2));

    }
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int xor=0;
        if(nums1.length%2==0 && nums2.length%2==1){
            for(int num:nums1){
                xor ^=num;
            }
            return xor;
        }
        else if(nums1.length%2==1 && nums2.length%2==0){
            for(int num:nums2){
                xor^= num;
            }
            return xor;
        }
        else if(nums1.length%2==0 && nums2.length%2==0){
            return 0;
        }
        else{
            for(int num:nums1){
                xor^=num;
            }
            for(int num:nums2){
                xor^=num;
            }
            return xor;
        }
    }
}
