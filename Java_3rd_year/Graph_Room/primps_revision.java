package Java_3rd_year.Graph_Room;
import java.util.*;


public class primps_revision {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    
    public primps_revision(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    static int cost=0;
    public void Primps(){
        PriorityQueue<PrimpsPair> pq= new PriorityQueue<>((a,b)-> a.cost-b.cost);
        HashSet<Integer> set= new HashSet<>();
        pq.add(new PrimpsPair(1, 1,0));
        while(!pq.isEmpty()){
            PrimpsPair rp= pq.poll();
            if(set.contains(rp.vtx)){
                continue;
            }
            set.add(rp.vtx);
            System.out.println(rp);
            cost+= rp.cost;

            for(int nbrs: map.get(rp.vtx).keySet()){
                if(!set.contains(nbrs)){
                    int cost= map.get(rp.vtx).get(nbrs);
                    pq.add(new PrimpsPair(nbrs, rp.vtx, cost));
                }
            }
        }

    }
    class PrimpsPair{
        int vtx;
        int acq_vtx;
        int cost;
        public PrimpsPair(int vtx, int acq_vtx, int cost){
            this.vtx=vtx;
            this.acq_vtx=acq_vtx;
            this.cost= cost;
        }

        @Override
        public String toString(){
            return vtx+ " "+ acq_vtx +" "+ "@ "+cost; 
        }
    }
    public static void main(String[] args) {
        primps_revision pq = new primps_revision(7);
		pq.AddEdge(1, 2, 5);
		pq.AddEdge(1, 4, 2);
		pq.AddEdge(3, 2, 3);
		pq.AddEdge(3, 4, 1);
		pq.AddEdge(5, 4, 6);
		pq.AddEdge(5, 6, 2);
		pq.AddEdge(5, 7, 4);
		pq.AddEdge(7, 6, 8);
        cost=0;
        pq.Primps();
        System.out.println();
        System.out.println(cost);
    }
}
