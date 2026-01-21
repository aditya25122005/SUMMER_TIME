package Java_3rd_year.Graph;
import java.util.*;
public class Graph2 {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph2(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>()); // har vertex ke corresponding khali map dal diya
        }

        
    }
    public void AddEdge (int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean BFS(int src, int des){
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            //1. Remove
            int r=q.poll();

            // 2. Ignore if Already visited
            if(visited.contains(r)){
                continue;
            }

            // 3. Mark visited
            visited.add(r);

            // 4. Self Work
            if(r==des){
                return true;
            }

            // 5. Add unvisited nbrs
            for(int nbrs : map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
    public boolean DFS(int src, int des){
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while(!st.isEmpty()){
            int r= st.pop();

            if(visited.contains(r)){
                continue;
            }

            visited.add(r);

            if(r==des){
                return true;
            }

            for(int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
    public void BFT(){
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }
        q.add(src);
        while(!q.isEmpty()){
            //1. Remove
            int r=q.poll();

            // 2. Ignore if Already visited
            if(visited.contains(r)){
                continue;
            }

            // 3. Mark visited
            visited.add(r);

            // 4. Self Work
            System.out.println(r+" ");

            // 5. Add unvisited nbrs
            for(int nbrs : map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        }
    
    }



    public void DFT(){
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }
        st.push(src);
        while(!st.isEmpty()){
            //1. Remove
            int r=st.pop();

            // 2. Ignore if Already visited
            if(visited.contains(r)){
                continue;
            }

            // 3. Mark visited
            visited.add(r);

            // 4. Self Work
            System.out.println(r+" ");

            // 5. Add unvisited nbrs
            for(int nbrs : map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        }
    
    }
}