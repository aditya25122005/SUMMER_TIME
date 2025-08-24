package Java_3rd_year.Day1;

public class BST {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    
    public BST(int[] in){
        root=Create_Tree(in,0,in.length-1);
    }
    private Node Create_Tree (int [] in,int si, int ei ){
        int mid= (si+ei)/2;
        Node nn= new Node();
        nn.val=in[mid];
        nn.left=Create_Tree(in, si, mid-1);
        nn.right=Create_Tree(in, mid+1, ei);
        return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if(nn==null) return;
        String str="<--"+nn.val+"-->";
        if(nn.left!=null){
            str= nn.left.val+str;
        }
        else{
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.val;
        }
        else{
            str=str+".";
        }
        System.out.println(str);
        display(nn.left);
        display(nn.right);
    }
    
    
}
