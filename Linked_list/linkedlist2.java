package Linked_list;

public class linkedlist2 {
    class Node{
        Node next;
        int data;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val){
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    //O(1)
    public void AddLast(int val){
        if(size==0){
            addFirst(val);
        }
        else{
            Node nn=new Node();
            nn.data=val;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void Add_at_index(int val, int k){
        if(k==0){
            addFirst(val);

        }
        else if(size==k){
            AddLast(val);
        }
        else{
            Node nn= new Node();
            nn.data=val;
            Node k_1th=GetNode(k-1);
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }
    //O(1)
    public int getFirst(){
        return head.data;
    }
    //O(1)
    public int getLast(){
        return tail.data;
    }
    //O(N)
    public int get_at_index(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Index out of range");
        }
        Node n=GetNode(k);
        return n.data;
    }
    public Node GetNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    //O(1)
    public int remove_first(){
        int val=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return val;
    }
    public int remove_last(){
        int val=tail.data;
        if(size==1){
            remove_first();
        }
        else{
        Node sl=GetNode(size-2);
        sl.next=null;
        tail=sl;
        size--;
        
        }
        return val;
    }
    public int remove_at_index(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Index out of range");
        }
        
        if(k==0){
           return remove_first();
        }
        else if(k==size-1){
           return remove_last();
        }
             
        else{
            
            Node prev=GetNode(k-1);
            Node curr=prev.next;
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.data;

        }
        
    }
    public int size(){
        return size;
    }
    //O(N)
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(".");
    }
}
