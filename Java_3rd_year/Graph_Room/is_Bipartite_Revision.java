package Java_3rd_year.Graph_Room;
import java.util.*;
public class is_Bipartite_Revision {
    private static HashMap<Integer,List<Integer>> map;
    public is_Bipartite_Revision(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new ArrayList<>());
        }
    }
    public void AddEdge(int v1, int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }
    public static boolean isBipartite(){
        Queue<BipartitePair> q= new LinkedList<>();
        HashMap<Integer,Integer> visited= new HashMap<>();
        for(int key:map.keySet()){
            if(visited.containsKey(key)) continue;
            q.add(new BipartitePair(key, 0));
            while(!q.isEmpty()){
            // remove
            BipartitePair rp= q.poll();
            //Ignore
            if(visited.containsKey(rp.vtx)){
                if(visited.get(rp.vtx)!= rp.dis) return false;
                continue;
            }
            // Mark visited
            visited.put(rp.vtx,rp.dis);
            // Self Work

            // Add unvisited nbrs
            for(int nbrs:map.get(rp.vtx)){
                if(!visited.containsKey(nbrs)){
                    q.add(new BipartitePair(nbrs, rp.dis+1));
                }
            }


        }
        }
        
        return true;
    }
    static class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx, int dis){
            this.vtx=vtx;
            this.dis=dis;
        }

    }
    public static void main(String[] args) {
        is_Bipartite_Revision bp= new is_Bipartite_Revision(4);
        bp. AddEdge(1,2);
        bp.AddEdge(2,3);
        bp.AddEdge(3,4);
        System.out.println(isBipartite());
    }
}
