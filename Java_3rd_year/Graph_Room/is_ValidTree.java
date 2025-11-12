package Java_3rd_year.Graph_Room;
import java.util.*;
public class is_ValidTree {
    public static void main(String[] args) {
        int n=5;
        int[][] edges={{0,1},{0,2},{0,3},{1,4}};
        System.out.println(validTree(n,edges));
    }
    public static boolean validTree(int n, int[][]edges){
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);

        }
        Stack<Integer> st= new Stack<>();
        
        HashSet<Integer> visited = new HashSet<>();
        int c=0;
        for(int key:map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            c++;
            st.push(key);
            while(!st.isEmpty()){
            // Remove
            int r= st.pop();

            // Ignore
            if(visited.contains(r)){
                return false;
            }
            // Add visited
            visited.add(r);

            // Self Work
           

            // Add unvisited nbrs
            for(int nbrs:map.get(r)){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            } 
        }
    }
    return c==1;
    }
}
