package Java_3rd_year.Trie;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {
    public static void main(String[] args) {
        int [] arr = {3,10,5,25,2,8};
        Trie t= new Trie();
        for(int num: arr){
            t.Add(num);
        }
        int ans=0;
        for(int x: arr){
            ans=Math.max(ans, t.getMaxXor(x));
        }
        System.out.println(ans);
    }


    static class Trie{
        //like binary tree
        class Node{
            // 2 type of node
            Node zero;
            Node one;
        }
        private Node root= new Node();
        public void Add(int val){ // add number like 25 in trie -> in binary
            Node curr= root;
            for(int i=31;i>=0;i--){
                int mask = 1<<i;
                if((mask & val)==0){ // bit
                    if(curr.zero!=null){
                        curr=curr.zero;
                    }
                    else{
                        Node nn= new Node();
                        curr.zero = nn;
                        curr= nn;
                    } 
                }
                else{
                     if(curr.one!=null){
                        curr=curr.one;
                    }
                    else{
                        Node nn= new Node();
                        curr.one = nn;
                        curr= nn;
                    } 
                }
                  

            }

        }
        public int getMaxXor(int x){
            int ans=0;
            Node curr= root;
            for(int i=31;i>=0;i--){
                int bit = x&(1<<i);
                if(bit==0){
                    if(curr.one!=null){
                        ans = ans | (1<<i);
                        // ans= ans+ (1<<i);
                        curr= curr.one;
                    }
                    else{
                        curr= curr.zero;
                    }
                }
                else{
                    if(curr.zero!=null){
                        ans= ans |(1<<i);
                        curr= curr.zero;
                    }
                    else{
                        curr= curr.one;
                    }
                }
            }
            return ans;
        }
    }
}

