package Java_3rd_year.HashMap;
import java.util.*;
public class Hashmap_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        //add
        map.put("Raj",89);
        map.put("Kunal",79);
        map.put("Ankit",95);
        map.put("Aditya",80);
        map.put("PCR",60);
        map.put("Aditya",90); // On adding duplicate ->Override
        System.out.println(map);
        //get
        System.out.println(map.get("Raj"));
        System.out.println(map.get("abc")); // null
        System.out.println(map.get("Aditya"));

        // contains key
        System.out.println(map.containsKey("Kunal"));
        System.out.println(map.containsKey("kaju"));

        // Remove
        System.out.println(map.remove("Raj"));

        System.out.println(map); // Raj will be removed

        TreeMap<String,Integer> map1= new TreeMap<>();
        map1.put("Raj",89);
        map1.put("Kunal",79);
        map1.put("Ankit",95);
        map1.put("Aditya",80);
        map1.put("PCR",60);
        map1.put("Aditya",90);
        System.out.println(map1);


        LinkedHashMap<String, Integer> map2= new LinkedHashMap<>();
        map2.put("Raj",89);
        map2.put("Kunal",79);
        map2.put("Ankit",95);
        map2.put("Aditya",80);
        map2.put("PCR",60);
        map2.put("Aditya",90);

        System.out.println(map2);

        System.out.println(map.keySet());

        Set<String> key= map.keySet();
        for(String k:key){
            System.out.println(k+" "+map.get(k));
        }

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }



    }
}
