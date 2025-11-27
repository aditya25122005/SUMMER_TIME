package Java_3rd_year.Graph_Room;
import java.util.*;
public class Disjoint_Set_Revise {
    class Node{
        int val;
        int rank; 
        Node parent;
    }
    private HashMap<Integer,Node> map= new HashMap<>();
    public void create(int v){
        Node nn= new Node();
        nn.val=v;
        nn.parent=nn;
        nn.rank=0;
        map.put(v,nn);
    }
    public int find(int v1){
        Node nn= map.get(v1);
        Node parent= find(nn);
        return parent.val;
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
        Node re1= find(nn1);
        Node re2= find(nn2);

        if(re1.rank==re2.rank){
            re1.parent=re2;
            re2.rank++;
        }
        else if(re1.rank<re2.rank){
            re1.parent= re2;
         
        }
        else{
            re2.parent=re1;

        }
    }
   
    public static void main(String[] args) {
        
    }
}
