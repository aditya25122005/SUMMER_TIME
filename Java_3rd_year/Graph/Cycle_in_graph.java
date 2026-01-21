package Java_3rd_year.Graph;
import java.util.*;
public class Cycle_in_graph {
	private HashMap<Integer,List<Integer>> map;
	public Cycle_in_graph(int v){
		map=new HashMap<>();
		for(int i=0;i<v;i++){
			map.put(i,new ArrayList<>());
		}
	}
	//Add a directed edge from v1 to v2.
	public void AddEdge(int v1,int v2){
		map.get(v1).add(v2);
	}
	//For finding the Indegree On a particular index.
	public int [] indegree() {
		int in []=new int[map.size()];
		for(int v1:map.keySet()) {
			for(int v2:map.get(v1)) {    //v2 recieves an edge from v1.
				in[v2]++;
			}
		}
		return in;
	}
	//For finding the Outdegree On a particular index.
	public int [] outdegree() {
		int out []=new int[map.size()];
		for(int v2:map.keySet()) {
			for(int v1:map.get(v2)) {   //v2 has an outgoing edge to v1.
				out[v2]++;
			}
		}
		return out;
	}
	// Perform Topological Sort (Kahn’s Algorithm)
	public  boolean isCycle() {
		Queue<Integer> q=new LinkedList<>();
		int in[]=indegree();
		for(int i=0;i<in.length;i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
        int c=0;
		while(!q.isEmpty()) {
			int r=q.poll();
            c++;
			System.out.print(r+" ");
			for(int nbrs:map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		return c!=map.size();
	}
	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(8);
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 0);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5); 
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);
		ts.Topological();
	}
}