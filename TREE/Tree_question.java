package TREE;

import java.util.Scanner;
import java.util.*;

public class Tree_question {
    class Node{
        int val;
        Tree_question.Node left;
        Tree_question.Node right;
    }

    private Tree_question.Node root;
    Scanner sc = new Scanner(System.in);
    public Tree_question(){
        root = CreateTree();
    }
    private Tree_question.Node CreateTree(){
        int item = sc.nextInt();
        Tree_question.Node nn = new Tree_question.Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();// has left child
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();// has right child
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public boolean find(int item) {
        return find(root, item);


    }


    public boolean find(Node nn, int item){
        if(nn==null) return false;
        if(nn.val==item){
            return true;
        }
        boolean left= find(nn.left, item);
        boolean right= find(nn.right, item);
        return left || right;
        

    }
    public int max(){
        return max(root);
    }
    public int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE; 
        }
        int lmax=max(nn.left);
        int rmax=max(nn.right);

        return Math.max(nn.val,Math.max(lmax,rmax));
        
    }

    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null){
            return -1;
        }
        int lh= ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh,rh)+1;
    }
    public void preOrder(){
        preOrder(root); 
    }
    private void preOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.val+" ");
        preOrder(nn.left);
        preOrder(nn.right);
    }
    public void LevelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);// addLast
        while(!q.isEmpty()){
            Node n=q.poll();  // q.remove() --> removeFirst
            System.out.println(n.val+"  ");
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
        System.out.println();
    }
    private void LevelOrder(Node nn){

    }



    public void display(){
        display(root);
    }
    private void display(Tree_question.Node nn){
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
