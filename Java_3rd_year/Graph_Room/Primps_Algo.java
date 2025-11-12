package Java_3rd_year.Graph_Room;
import java.util.*;
public class Primps_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Primps_Algo(int v){
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
        int v;
        int acqv;
        int cost;
        public PrimpsPair(int v, int acqv , int cost){
            this.v=v;
            this.acqv=acqv;
            this.cost=cost;
        }
        @Override
        public String toString() {
            return v + " - " + acqv + " @ " + cost;
        }
    }

    public int primps(){
        PriorityQueue <PrimpsPair> pq= new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimpsPair(1, 1, 0));
        int sum=0;
        while(!pq.isEmpty()){
            PrimpsPair rp= pq.poll();
            if(visited.contains(rp.v)){
                continue;
            }
            visited.add(rp.v);
            // System.out.println(rp);
            sum+= rp.cost;
            for(int nbrs:map.get(rp.v).keySet()){
                if(!visited.contains(nbrs)){
                    int cost= map.get(rp.v).get(nbrs);
                    pq.add(new PrimpsPair(nbrs, rp.v, cost));
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        Primps_Algo pa= new Primps_Algo(n);
        for(int i=0;i<m;i++){
            int v1= sc.nextInt();
            int v2= sc.nextInt();
            int cost= sc.nextInt();
            pa.AddEdge(v1, v2, cost);
        }
        System.out.println(pa.primps());
    }
}
