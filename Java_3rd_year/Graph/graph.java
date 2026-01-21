package Java_3rd_year.Graph;
import java.util.*;

import HASHMAP.hashmap;
public class graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public graph(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>()); // har vertex ke corresponding khali map dal diya
        }
    }
    public void AddEdge (int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1, int v2){
        
        return map.get(v1).containsKey(v2);
    }
    public int noofEdge(){
        int sum=0;
        for(int vtx:map.keySet()){
            sum= sum+ map.get(vtx).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removevertex(int v1){
        for(int nbrs:map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    public void Display(){
        for(int v:map.keySet()){
            System.out.println(v+" "+map.get(v));
        }
    }
    public boolean Haspath(int src, int des,HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
            boolean ans=Haspath(nbrs, des,visited);
            if(ans){
                return ans;
            }
        }
        }
        return false;
    }
    public void printPath(int src, int des, HashSet<Integer> visited, String ans)
	{
		if(src==des)
		{
			System.out.println(ans+des);
			return;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet())
		{
			if(!visited.contains(nbrs))
			{
				printPath(nbrs, des, visited, ans+src);
			}
		}
	}
}
