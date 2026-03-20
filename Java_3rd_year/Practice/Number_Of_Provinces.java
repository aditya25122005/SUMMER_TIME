package Java_3rd_year.Practice;
import java.util.*;
public class Number_Of_Provinces {
    public static void main(String[] args) {
        int [][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(Solve(isConnected));
    }
    public static int Solve(int [][] isConnected){
        HashMap<Integer,List<Integer>> map= new HashMap<>();

        for(int i=1;i<=isConnected.length;i++){
            map.put(i, new ArrayList<>());
        }
        int n= isConnected.length;

        for(int i=0;i<isConnected.length;i++){
            int u= i+1;
            int [] nbr= isConnected[i];
            for(int j=0;j<nbr.length;j++){
                if(nbr[j]==1){
                    map.get(u).add(j+1);
                }
            }
        }
        int comp=0;
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited= new HashSet<>();
        for(int node=1;node<=n;node++){
            if(!visited.contains(node)){
                comp++;
                q.add(node);
                while(!q.isEmpty()){
                    int rm= q.poll();
                    if(visited.contains(rm)){
                        continue;
                    }
                    visited.add(rm);
                    for(int nbrs: map.get(rm)){
                        if(!visited.contains(nbrs)){
                            q.add(nbrs);
                        }
                    }
                }

            }
        }
        return comp;

    }
}
