package cf;
import java.util.*;
public class Hit_The_Lottery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int [] arr= {1,5,10,20,100};
        int n= arr.length;
        int note=0;
        int i=n-1;
        while(N>0 && i>=0){
            if(N>=arr[i]){
                N-=arr[i];
                note++;
            }
            else{
                i--;
            }
        }
        System.out.println(note);
        // while(N>0){
        //     int i=n-1;
        //     while(i>=0 && N>0){
        //         if(N<=arr[i]){
        //             N-=arr[i];
        //         }
        //         else{
        //             i--;
        //         }
        //     }
        // }
    }
}
