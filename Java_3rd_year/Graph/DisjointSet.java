package Java_3rd_year.Graph;

import Java_3rd_year.HashMap.HashMap;

public class DisjointSet {
    class Node{
        int val;
        int rank;
        Node parent;
    }
    private HashMap<Integer,Node> map = new HashMap<>();

    // create
    public void create(int v){ // vtx ke corresponding set
        Node nn = new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }

    // find
    public int find(int v){
        Node node= map.get(v);
        return  find(node).val;

    }
    private Node find(Node node){ // vtx ka addrress
        if(node.parent==node){
            return node;
        }
       Node n= find(node.parent);
       node.parent=n; // Path Compression
       return n;
    }

    // union

    public void union(int v1, int v2){ // return type Node wale find ka call lagayenge
        Node node1= map.get(v1); // v1 vtx kaha par create hua hai
        Node node2= map.get(v2); // v2 vtx kaha par create hua hai

        Node RE1 = find(node1);
        Node RE2 = find(node2);

        if(RE1.rank== RE2.rank){
            RE1.parent=RE2;
            RE2.rank++;
        }
        else if(RE1.rank<RE2.rank){
            RE1.parent=RE2;     // Rank same rahegi
        }
        else{
            RE2.parent=RE1;  // Rank same rahegi
        }

    }

}
