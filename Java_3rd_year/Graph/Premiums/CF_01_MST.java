package Java_3rd_year.Graph.Premiums;
import java.util.*;
public class CF_01_MST {
    static HashMap<Integer,HashSet<Integer>> map ;


    public static void main(String[] args) {
        map= new HashMap<>();
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=1;i<=n;i++){
            map.put(i,new HashSet<>());
        }
        for(int i=1;i<=m;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        System.out.println(prims());
    }
    public static int prims(){
        PriorityQueue <Pair> pq= new PriorityQueue<>((a,b)-> a.cost-b.cost);
        pq.add(new Pair(1,0));
        HashSet<Integer> visited = new HashSet<>();
        int sum=0;
        while(!pq.isEmpty()){
            // Remove
            Pair rp= pq.poll();
            // Ignore
            if(visited.contains(rp.vtx)){
                continue;
            }
            // mark Visited
            visited.add(rp.vtx);
            // Self Work
            sum += rp.cost; 
            // Add unvisited nbrs
            for(int nbrs=1;nbrs<=map.size();nbrs++){
                if(!visited.contains(nbrs)){
                    int cost=0;
                    if(map.get(rp.vtx).contains(nbrs)){
                        cost++;
                    }
                    pq.add(new Pair(nbrs, cost));
                }
            }


        }
        return sum;


    }
    static class Pair{
        int vtx;
        int cost;
        public Pair(int vtx, int cost){
            this.vtx=vtx;
            this.cost= cost;
        }
        
    }
}
