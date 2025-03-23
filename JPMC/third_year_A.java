package JPMC;
import java.util.*;
public class third_year_A {
    public static void main(String[] args) {
        int [] arr={1,2,4};
        int m=4;
        int ans=0;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int e:arr){
            maxheap.add(e);
        }
        while(m!=0){
            int maxItem=maxheap.poll();
            ans+=maxItem;
            m--;

            maxItem--;
            if(maxItem>0){
                maxheap.add(maxItem);
            }
        }
        System.out.println(ans);

       
        // while(m!=0){
        //     Arrays.sort(arr);
        //     max+= arr[arr.length-1];
        //     arr[arr.length-1]--;
        //     m--;
        // }
        // System.out.println(max);
    }
}
