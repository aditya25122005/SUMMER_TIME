package Java_3rd_year.Graph_Room;
import java.util.*;
public class DisjointSet{
    class Node {
        int rank;
        Node parent;
        int data;


    }
    private HashMap<Integer,Node> map= new HashMap<>();

    // O(1)
    public void createSet(int v){ //1 vertex ke liye set create karna hai
        Node nn = new Node();
        nn.data=v;
        nn.parent=nn;
        nn.rank=0;
        map.put(v,nn);
    }

    // log(N)
    public int find(int v){ // Find representative element
        Node nn= map.get(v);
        return find(nn).data;
    }
    private Node find(Node nn){
        if(nn.parent==nn){
            return nn;
        }
        Node n= find(nn.parent);
        nn.parent=n;
        return n;
    }


    public void union(int v1, int v2){
        Node nn1= map.get(v1);
        Node nn2= map.get(v2);

        Node re1=  find(nn1);
        Node re2=  find(nn2);

        if(re1.rank== re2.rank){
            re1.parent= re2;
            re2.rank++;
        }
        else if(re1.rank<re2.rank){
            re1.parent= re2;
        }
        else{
            re2.parent =re1;
        }

    }
}