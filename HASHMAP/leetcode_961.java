package HASHMAP;

import java.util.HashMap;

public class leetcode_961 {
    public static void main(String[] args) {
        int [] nums={1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
     public static int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(int i : map.keySet()){
    Integer value = map.get(i); // Get value safely
    if (value != null && value == n) {
        return i;
    }
        }
        return -1;
    }
}
