package Linked_list;

public class linkedList {
    class Node {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    //O(1)
    public void AddFirst(int item){
        Node nn= new Node();
        nn.val=item;
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
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println(".");
    }
    public void AddLast(int val){
        if(size==0){
            AddFirst(val);
        }
        else{
            Node nn=new Node();
            nn.val=val;
            tail.next=nn;
            tail=nn;
        }   
    }
    public Node GetNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Range me nhi hai");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Add_at_index(int item, int k) throws Exception{
        
        if(k==0){
            AddFirst(item);
        }
        else if(k==size){
            AddLast(item);
        }
        else{
            Node nn = new Node();
            nn.val=item;
            Node prev=GetNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;

        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int get_at_index(int k) throws Exception{
        return GetNode(k).val;
    }
    public int removeFirst(){
        int val=head.val;
        if(size==1){
            head=null;
            tail=null;
            size=0;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
        }
        return val;
    }
    public int removeLast() throws Exception{

        if(size==1){
            return removeFirst();
        }
        else{
           int val=tail.val;
           Node sl=GetNode(size-2);
           tail=sl;
           tail.next=null;
           size--;
           return val;
        }
    }
    public int remove_at_index(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node prev=GetNode(k-1);
            Node curr=GetNode(k);
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.val;
        }

    }

}

