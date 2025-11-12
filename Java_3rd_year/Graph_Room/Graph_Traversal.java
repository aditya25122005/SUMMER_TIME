package Java_3rd_year.Graph_Room;
import java.util.*;

import Java_3rd_year.Graph.graph;

public class Graph_Traversal {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Graph_Traversal(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }

    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void BFT(){
        Queue<Integer> q= new LinkedList<>();
        
        HashSet<Integer> visited = new HashSet<>();
        for(int key:map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            q.add(key);
            while(!q.isEmpty()){
            // Remove
            int r= q.poll();

            // Ignore
            if(visited.contains(r)){
                continue;
            }
            // Add visited
            visited.add(r);

            // Self Work
            System.out.println(r+" ");

            // Add unvisited nbrs
            for(int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            } 

        }
    }
    System.out.println();
    }
    
    public void DFT(){
        Stack<Integer> st= new Stack<>();
        
        HashSet<Integer> visited = new HashSet<>();
        for(int key:map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            st.push(key);
            while(!st.isEmpty()){
            // Remove
            int r= st.pop();

            // Ignore
            if(visited.contains(r)){
                continue;
            }
            // Add visited
            visited.add(r);

            // Self Work
            System.out.println(r+" ");

            // Add unvisited nbrs
            for(int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            } 
        }
    }
    System.out.println();
    }
    public static void main(String[] args) {
        Graph_Traversal g= new Graph_Traversal(7);  // 7 vertex hai ->numbering 1---7
        g.AddEdge(1, 4, 2);
        g.AddEdge(1, 2, 5);
        g.AddEdge(3, 3, 7);
        g.AddEdge(4, 4, -1);
        g.AddEdge(5, 4, 3);
        g.AddEdge(5, 6, 7);
        g.AddEdge(5, 7 , 8);
        g.AddEdge(7, 6, 4);
        g.BFT();
        g.DFT();
    }
}
