package Java_3rd_year.Graph;
import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class Primps_Algorithm{

    private HashMap<Integer,HashMap<Integer,Integer>> map;

    public Primps_Algorithm(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }

    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }


    class PrimpsPair{
        int vtx;
        int acq_vtx;
        int cost;
        public PrimpsPair(int vtx, int acq_vtx, int cost){
            this.vtx=vtx;
            this.acq_vtx=acq_vtx; // function ka local variable and class ka data member same name hai isliye we use this keyword
            this.cost=cost;
        }
        @Override
        public String toString(){
            return vtx+" "+ acq_vtx +" @ "+cost;
        }
        
    }

    public void Primps_Algorithm(){
        // PriorityQueue<PrimpsPair> pq= new PriorityQueue<>(new Comparator<PrimpsPair>(){
        //     @Override
        //     public int compare(PrimpsPair o1, PrimpsPair o2){       // compare is in comparator interface
        //         return o1.cost=o2.cost;
        //     }
        // });
                                                        //a,b -> primps pair
        PriorityQueue<PrimpsPair> pq= new PriorityQueue<>((a,b)->a.cost-b.cost);   // min heap   
        HashSet<Integer> visited= new HashSet<>();
        pq.add(new PrimpsPair(1, 1, 0));
        while(!pq.isEmpty()){
            // Remove
            PrimpsPair rp= pq.poll();
            // Ignore if Already visited
            if(visited.contains(rp.vtx)){
                continue;
            }
            // Mark Visited
            visited.add(rp.vtx);

            // Self Work
            System.out.println(rp);

            // Add unvisited neighbours
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost= map.get(rp.vtx).get(nbrs);
                pq.add(new PrimpsPair(nbrs,rp.vtx, cost));
                }
            }


        }

    }
    public static void main(String[] args) {
        Primps_Algorithm pq = new Primps_Algorithm(7);
		pq.AddEdge(1, 2, 5);
		pq.AddEdge(1, 4, 2);
		pq.AddEdge(3, 2, 3);
		pq.AddEdge(3, 4, 1);
		pq.AddEdge(5, 4, 6);
		pq.AddEdge(5, 6, 2);
		pq.AddEdge(5, 7, 4);
		pq.AddEdge(7, 6, 8);
		pq.Primps_Algorithm();
    }

}

