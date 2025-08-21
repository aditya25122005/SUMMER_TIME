package Java_3rd_year.Heap;

import java.util.*;
public class minimum_sum_pair{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int a= pq.poll();
            int b= pq.poll();
            sum+=(a+b);
            pq.add(a+b);
        }
        System.out.println(sum);
    }
}