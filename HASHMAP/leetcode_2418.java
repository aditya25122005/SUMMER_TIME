package HASHMAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode_2418 {
    public static void main(String[] args) {
        String [] names={"ram","shyam","Shankar"};
        int [] heights={100,300,200};
        System.out.println(sortPeople(names, heights));  //print full array to get correct answer
    }
     public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
       
        List<String> ll= new ArrayList<>();
        for(int i=heights.length-1;i>=0;i--){
            ll.add(map.get(heights[i]));
        }
        String[] array = ll.toArray(new String[0]);
        
        return array;
    }
}
