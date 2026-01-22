package Java_3rd_year.Bit_Masking;

public class Set_Theory_Venn {
    public static void main(String[] args) {
        int [] arr={2,3,5};
        int n=1000;
        System.out.println(venn_Diagram(arr, n));

    }
    public static int venn_Diagram(int[] arr, int n){
        int l= arr.length;
        int count=0;
        for(int i=1;i< (1<<l);i++){
            int ans= Power_Set(arr,n,i);
            if(set_bit(i)%2==0){
                count-= ans;
            }
            else{
                count+= ans;
            }
        }
        return count;
    }
    public static int Power_Set(int[] arr, int n, int i){
        int mul=1;
        int idx=0;
        while(i>0){
            if((i&1) !=0){
                mul*= arr[idx];
            }
            idx++;
            i>>=1;
        }
        return n/mul;

    }
    public static int set_bit(int n){
        int ans=0;
        while(n>0){
            ans++;
            n= n&(n-1);
        }
        return ans;
    }
}
