package Java_3rd_year.Heap;
import java.util.*;
public class Meeting_rooms_2 {
    public static void main(String[] args) {
        int [] []intervals={{10,30},{5,10},{15,20},{2,6},{12,18},{19,25},{1,5},{3,5}};
       
        // for(int i=0;i<intervals.length;i++){
        //     System.out.println(intervals[i][0]+" "+ intervals[i][1]);
        // }
        System.out.println(Meeting_rooms(intervals));
    }   
    public static int Meeting_rooms(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=pq.peek()[1]){
                pq.poll();
            }
            pq.add(intervals[i]);
            
        }
        return pq.size();
    }
}
