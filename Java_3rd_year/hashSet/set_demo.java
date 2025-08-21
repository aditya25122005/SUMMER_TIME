package Java_3rd_year.hashSet;
import java.util.*;
import java.util.HashSet;

public class set_demo {
    public static void main(String[] args) {
        HashSet<Integer> hh= new HashSet<>();
        hh.add(1);
        hh.add(3);
        hh.add(3);
        hh.add(5);
        hh.add(6);
        hh.add(66);
        System.out.println(hh); // Gives random order

        //contains
        System.out.println(hh.contains(67));
        System.out.println(hh.contains(66));

        //remove
        System.out.println(hh.remove(1));  // true
        System.out.println(hh.remove(9));  // false

        TreeSet<Integer> h1= new TreeSet<>();
        h1.add(1);
        h1.add(34);
        h1.add(34);
        h1.add(-8);
        System.out.println(h1); // Sorted

        LinkedHashSet<Integer> h2= new LinkedHashSet<>();
        h2.add(1);
        h2.add(34);
        h2.add(34);
        h2.add(-8);
        System.out.println(h2);  // input order me


        for(int x:h2){
            System.out.println(x);
        }

        System.out.println(h2.size());

        
    }   
}
