package Java_3rd_year.Bit_Masking;

public class prob {
    public static void main(String[] args) {
        int n=75;
        int i=3;
        // n=n>>i;
        // if((n&1)==1){
        //     System.out.println("Set");
        // }
        // else{
        //     System.out.println("Unset");
        // }

        int mask= 1<<i;
        if((n&mask)!=0){
            System.out.println("Set");
        }
        else{
            System.out.println("Not-Set");
        }
    }
    
}
