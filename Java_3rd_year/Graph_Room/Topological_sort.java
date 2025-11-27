package Java_3rd_year.Graph_Room;
import java.util.*;

import apr.stack_class;
public class Topological_sort {
    private HashMap<Integer,List<Integer>> map;

    public Topological_sort(int v){
        map= new HashMap<>();
        for(int i=0;i<v;i++){
            map.put(i,new ArrayList<>());
        }
    }
    public void AddEdge(int v1, int v2){
        map.get(v1).add(v2);
    }
    public int[] inorder(){
        int[] in= new int[map.size()];
        for(int key:map.keySet()){
            for(int v:map.get(key)){
                in[v]++;
            }
        }
        return in;

    }

    public void Topo_Sort(){
        int[] in= inorder();
        Queue<Integer> q= new LinkedList<>();
 
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int rm= q.poll();
            System.out.println(rm);
            for(int nbrs:map.get(rm)){
                in[nbrs]--;
                if(in[nbrs]==0) q.add(nbrs);
            }
        }
    }

    public  boolean has_Cycle(){
        int c=0;
        int[] in= inorder();
        Queue<Integer> q= new LinkedList<>();
   
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int rm= q.poll();
            c++;
            System.out.println(rm);
            for(int nbrs:map.get(rm)){
                in[nbrs]--;
                if(in[nbrs]==0) q.add(nbrs);
            }
        }
        return c!=map.size();
    }


    public static void main(String[] args) {

        Topological_sort ts= new Topological_sort(8);
        ts.AddEdge(1, 2);
		ts.AddEdge(1, 0);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5); 
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);

        ts.Topo_Sort();
        

    }
}
