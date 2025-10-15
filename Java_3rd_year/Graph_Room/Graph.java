package Java_3rd_year.Graph_Room;
import java.util.*;

import HASHMAP.hashmap;
public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Graph(int v){
        map= new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }

    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void AddVertex(int v){
        map.put(v,new HashMap<>());
    }
    public boolean ContainsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noOfEdge(){
        int sum=0;
        for(int key:map.keySet()){
            sum+= map.get(key).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v1){  // 4
        for(int nbrs: map.get(v1).keySet()){//1,3,4
            map.get(nbrs).remove(v1); // 1 me jaakr 4 ko delete mao
        }
        map.remove(v1);
    }
    public void Display(){
        for(int key:map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    public boolean haspath(int src, int des,HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){

            if(!visited.contains(nbrs)){
            boolean ans= haspath(nbrs, des,visited);
            
            if(ans){
                return true;
            }
        }
        }
        return false;
    }
    public void PrintAllPath(int src, int des,HashSet<Integer> visited,String ans){
        if(src==des){
            System.out.println(ans + des);
            return;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                PrintAllPath(nbrs, des, visited, ans+src);

            }
        }
        visited.remove(src);
    }
    public boolean BFS(int src, int des){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();
        while(!q.isEmpty()){
            // Remove
            int r= q.poll();

            // Ignore
            if(visited.contains(r)){
                continue;
            }
            // Add visited
            visited.add(r);

            // Self Work
            if(r==des){
                return true;
            }

            // Add unvisited nbrs
            for(int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            } 

        }
        return false;

    }
    public boolean DFS(int src, int des){
        Stack<Integer> st= new Stack<>();
        st.push(src);
        HashSet<Integer> visited = new HashSet<>();
        while(!st.isEmpty()){
            // Remove
            int r= st.pop();

            // Ignore
            if(visited.contains(r)){
                continue;
            }
            // Add visited
            visited.add(r);

            // Self Work
            if(r==des){
                return true;
            }

            // Add unvisited nbrs
            for(int nbrs:map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            } 

        }
        return false;
    }




}
