package Java_3rd_year.Graph_Room;
import java.util.*;


public class BellMan_Ford {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public BellMan_Ford(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);  // v1---> v2 directed edge with cost 
    }
    class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1, int e2, int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
    }
    public List<EdgePair> getAllEdges(){
        List<EdgePair> ll= new ArrayList<>();
        for(int v1:map.keySet()){
            for(int v2:map.get(v1).keySet()){
                int cost=map.get(v1).get(v2);
                ll.add(new EdgePair(v1, v2, cost));
            }
        }
        return ll;
    }
    public void BellMan(){
        int v=map.size();
        int [] dp= new int[v+1];
        for(int i=2;i<=v;i++){
            dp[i]=999999;
        }
        List<EdgePair> ll= getAllEdges();
        Collections.sort(ll,(a,b)->a.cost-b.cost);
        for(int i=1;i<=v;i++){
            for(EdgePair e:ll){
                if(i==v && dp[e.e2]>dp[e.e1]+e.cost){
                    System.out.println("-ve edge cycle detected");
                    return;
                }
                if(dp[e.e2]>dp[e.e1]+e.cost){
                    dp[e.e2] = dp[e.e1]+e.cost;
                }
            }
        }
        for(int i=1;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }
    public static void main(String[] args) {
        BellMan_Ford bf= new BellMan_Ford(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(2, 5, 2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
        bf.BellMan();
    }
}
