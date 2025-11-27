package Java_3rd_year.Bit_Masking;

public class single_number {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,3};
        int xor=0;
        for(int num:nums) xor ^=num;
        System.out.println(xor);



        int [] arr={1,2,5,3};
        int n= arr.length+1;
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            xor2^= arr[i];
            xor2^= (i+1);
        }
        System.out.println(xor2^n);


        

    }

}
