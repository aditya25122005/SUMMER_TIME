package Java_3rd_year.Graph_Room;

import java.util.*;

import Java_3rd_year.Graph.Kruskals_Algorithm;



public class Kruskal_revise {
    class EdgePair{
        int e1,e2,cost;
        public EdgePair(int e1, int e2, int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return e1+"-"+e2+" "+ "@"+cost;
        }
    }
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Kruskal_revise(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }

    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public List<EdgePair> getAllEdge(){
        List<EdgePair> ll= new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                ll.add(new EdgePair(e1, e2, map.get(e1).get(e2)));
            }
        }
        return ll;
    }
    static int cost=0;
    public void Kruskal(){
        List<EdgePair> ll= getAllEdge();
        Collections.sort(ll,(a,b)-> a.cost-b.cost);

        Disjoint_Set_Revise dsu= new Disjoint_Set_Revise();
        for(int v:map.keySet()){
            dsu.create(v);
        }
        for(EdgePair e:ll){
            int re1= dsu.find(e.e1);
            int re2= dsu.find(e.e2);

            if(re1==re2){

            }
            else{
                cost+= e.cost;
                dsu.union(e.e1, e.e2);
            }

        }
    }
    public static void main(String[] args) {
        Kruskal_revise ks= new Kruskal_revise(7);
        ks.AddEdge(1, 4, 4);
        ks.AddEdge(1, 2, 3);
        ks.AddEdge(3, 2, 5);
        ks.AddEdge(3, 4, 6);
        ks.AddEdge(5, 4, 8);
        ks.AddEdge(5, 6, 2);
        ks.AddEdge(5, 7, 1);
        ks.AddEdge(7, 6, 9);
        ks.Kruskal();
        System.out.println(cost);
    }
}
