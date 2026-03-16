package Java_3rd_year.Trie;

import java.util.*;
public class Leetcode_1707 {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4};
        int[][] queries={{3,1},{1,3},{5,6}};
        int [][] q= new int[queries.length][3];
        for(int i=0;i<queries.length;i++){
            q[i][0]= queries[i][0];
            q[i][1]= queries[i][1];
            q[i][2]= i;
        }
        Arrays.sort(q,(a,b)->a[1]-b[1]);
        Arrays.sort(arr);
    }
}
