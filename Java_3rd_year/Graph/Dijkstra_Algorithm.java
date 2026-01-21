package Java_3rd_year.Graph;
import java.util.*;
public class Dijkstra_Algorithm {
     private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Dijkstra_Algorithm(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>()); // har vertex ke corresponding khali map dal diya
        }
        
    }
    public void AddEdge (int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
   
    class DijkstraPair{
        int vtx;
        String acqpath;
        int cost;
        public DijkstraPair(int vtx, String acqpath, int cost){
            this.vtx=vtx;
            this.acqpath= acqpath;
            this.cost=cost;
        }
         @Override
        public String toString() {
            return vtx + " - " + acqpath + " @ " + cost;
        }
    }
    public void Dijkstra(){
        PriorityQueue <DijkstraPair> pq= new PriorityQueue<>((a,b)->a.cost- b.cost);
        HashSet<Integer> visited= new HashSet<>();
        pq.add(new DijkstraPair(1,"1",0));
        while(!pq.isEmpty()){
            // remove
            DijkstraPair rp= pq.poll();

            // Ignore
            if(visited.contains(rp.vtx)){
                continue;
            }

            // Mark visited
            visited.add(rp.vtx);

            // Self work
            System.out.println(rp);

            // Add unvisited nbrs
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost= map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs, rp.acqpath+nbrs, rp.cost+cost));
                }
            }

        }

    }
    public static void main(String[] args) {
        
        Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.Dijkstra();

    }
}
