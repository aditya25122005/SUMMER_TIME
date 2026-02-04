package Java_3rd_year.Trie;
import java.util.*;
public class Tries_Contacts {
    static class Node {
        char ch;
        boolean isTerminal;
        HashMap<Character,Node> child;
        int count;

        public Node(char ch){
            this.ch=ch;
            child= new HashMap<>();
            count=1;
        }
    }
    private static Node root = new Node('*');;

    public Tries_Contacts(){
        root= new Node('*'); 
    }

    public static void insert(String word) {
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr= curr.child.get(ch); 
                curr.count++;
            }
            else{

                Node nn= new Node(ch);
                curr.child.put(ch, nn);
                curr=nn;
            }
        }
        curr.isTerminal=true;
    }

    public static int search(String word) {
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr= curr.child.get(ch); 
            }
            else{
                return 0;
            }
        }
        return curr.count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        List<List<String>> ll= new ArrayList<>();
        for(int i=0;i<n;i++){
            String opr= sc.next();
            String item= sc.next();
            ll.add(Arrays.asList(opr,item));
        }
        for(List<String> l:ll){
            if(l.get(0).equals("add")){
                insert(l.get(1));
            }
            else{
                System.out.println(search(l.get(1)));

            }
        }
    }
}
