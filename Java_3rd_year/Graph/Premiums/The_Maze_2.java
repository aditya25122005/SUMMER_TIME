package Java_3rd_year.Graph.Premiums;
import java.util.*;
import java.util.PriorityQueue;

public class The_Maze_2 {
    public static int shortestDistance(int[][] maze , int[] start, int [] destination){
        PriorityQueue<int[]> pq= new PriorityQueue<>((a, b) -> a[2] - b[2]); 
        boolean[][] visited= new boolean[maze.length][maze[0].length];
        pq.add(new int[] {start[0], start[1] , 0}); // row and column of start 
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        while(!pq.isEmpty()){
            // Remove
            int [] curr=pq.poll();

            // Ignore
            if(visited[curr[0]][curr[1]]==true){
                continue;
            }
            // Visited
            visited[curr[0]][curr[1]]=true;
            // Self Work
            if(curr[0]==destination[0] && curr[1]==destination[1]){
                return curr[2];
            }
            // Add unvisited nbrs
            for(int i=0;i<4;i++){  // 1 direction me kitna chalenge
                int x= curr[0];
                int y= curr[1];
                while(x+r[i]>=0 && x+r[i]<maze.length && y+c[i]>=0 && y+c[i]<maze[0].length && maze[x+r[i]][y+c[i]]==0){
                    x+= r[i];
                    y+= c[i];
                }
                if(x!=curr[0] || y!=curr[1]){
                    int cost = Math.abs(x-curr[0])+Math.abs(y-curr[1]);
                    pq.add(new int[]{x,y,curr[2]+cost});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] maze= {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
            };
    int [] start={0,4};
    int [] dest={4,4};
    System.out.println(shortestDistance(maze, start, dest));

    }
}
