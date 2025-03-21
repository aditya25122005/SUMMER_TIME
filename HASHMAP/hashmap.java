package HASHMAP;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        
    // HashMap<String, String> capitalcities= new HashMap<String, String>();
    // capitalcities.put("India","Delhi");
    // capitalcities.put("Aus","Sydney");
    // capitalcities.put("a","1");
    
    // System.out.println(capitalcities.get("Aus"));
    // capitalcities.remove("a");

    // System.out.println(capitalcities.size());
    // for(String i: capitalcities.keySet()){
    //     System.out.println(i);
    // }
    // for(String i: capitalcities.values()){
    //     System.out.println(i);
    // }
    // for(String i : capitalcities.keySet()){
    //     System.out.println("key  "+ i+ " value "+ capitalcities.get(i));
    // }

    // System.out.println(capitalcities);
    // HashMap<String,Integer> map = new HashMap<>();
    // map.put("Aditya",20);
    // map.put("Tarun",16);
    // map.put("abcd",100);
    // for(String i:map.keySet()){
    //     System.out.println(i+" "+ map.get(i));
    // }
        HashMap<Integer, Integer> map=new HashMap<>();
        int [] arr={1,2,3,4,2,3,1,2,4,5,32,2};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);       
            }
            else{  
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

    }
}
