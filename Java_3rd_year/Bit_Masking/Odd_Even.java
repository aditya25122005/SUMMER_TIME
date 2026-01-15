package Java_3rd_year.Bit_Masking;

public class Odd_Even {
    public static void main(String[] args) {
        int num=893;
        if((num & 1) ==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

}
