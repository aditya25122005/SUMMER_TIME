package TREE;
import java.util.*;
// use
//file system
// left subTree  (left to the root)
// right subTree (right to the root)
public class binarytree {
    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc= new Scanner(System.in);
    public binarytree(){
        root=CreateTree();
    }
    private Node CreateTree(){
        int item=sc.nextInt();
        Node nn= new Node();
        nn.val=item;
        boolean hlc = sc.nextBoolean();  //has left child
        if(hlc){
            nn.left=CreateTree();
        }
        boolean hrc= sc.nextBoolean();  //has right child
        if(hrc){ 
            nn.right=CreateTree();
        }
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
