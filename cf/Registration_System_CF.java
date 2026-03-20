package cf;
import java.util.*;
public class Registration_System_CF {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        HashSet<String> hh= new HashSet<>();
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<N;i++){
            String s= sc.next();
            if(!map.containsKey(s)){
                map.put(s,0);
                System.out.println("OK");
            }
            else{
                int add=map.get(s)+1;
                map.put(s,add);
                map.put(s+add, 0);
                System.out.println(s+add);
            }

        }
    }
}
