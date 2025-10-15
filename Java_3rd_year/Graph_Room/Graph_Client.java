package Java_3rd_year.Graph_Room;
import java.util.*;
public class Graph_Client {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		// g.Display();
        // g.removeVertex(4);
        // System.out.println("************");
        // g.Display();
        System.out.println(g.haspath(1,6, new HashSet<Integer>() ));
        g.PrintAllPath(1, 06, new HashSet<Integer>(), "");
        System.out.println(g.BFS(1,6));
        System.out.println(g.DFS(1, 6));
    }
}
