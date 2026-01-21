package Java_3rd_year.Graph.Premiums;

import java.util.*;

public class MST_01_Optimized {
    static TreeMap<Integer,TreeSet<Integer>> map;

    static TreeSet<Integer> set= new TreeSet<>();


    public static void main(String[] args) {
        map= new TreeMap<>();
        set= new TreeSet<>();
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=1;i<=n;i++){
            map.put(i,new TreeSet<>());
            set.add(i);

        }
        for(int i=1;i<=m;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(set.remove(i)){ // true //_> 1 se DFS start kya aur Count++ 
                ans++;
                //DFS
                dfs(i);

            }
        }
        // System.out.println(prims());
        System.out.println(ans-1);
    }
    private static void dfs(int i){
        Stack<Integer> st= new Stack<>();
        for(int x:set){
            if(! map.get(i).contains(x)){
                st.push(x);
            }
        }
        while(!st.isEmpty()){
            int s= st.pop();
            if(!set.contains(s)){
                continue;
            }
            set.remove(s);
            for(int x:set){
                if(!map.get(s).contains(x)){
                    st.push(x);
                }
            }

        }
    }
}
