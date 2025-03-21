package Linked_list;

public class linkedlist2Client {
   public static void main(String[] args) throws Exception {
    linkedlist2 ll= new linkedlist2();
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(30);
    ll.AddLast(40);
    ll.AddLast(50);
    ll.Add_at_index(200, 2);
    System.out.println("Removed ele "+ll.remove_first());
    System.out.println("Removed ele "+ll.remove_last());
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
    System.out.println(ll.get_at_index(1));
    System.out.println(ll.size());
    System.out.println(ll.remove_at_index(2));
    ll.display();
   }

    
}
