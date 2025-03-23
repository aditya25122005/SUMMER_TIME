package JPMC;
import java.util.*;
public class thiry_year_B {
    public static void main(String[] args) {
        int [] arr={1,2,20,8,8,1,2,5,8,0};
        int x=8;
        int query[]={100,2,1,3,4};
        int [] ans=new int[query.length];
        int idx=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                map.put(idx,i+1);
                idx++;
            }
        }
        for(int i=0;i<ans.length;i++){
            if(query[i]>map.size()){
                ans[i]=-1;
            }
            else{
                ans[i]=map.get(query[i]);
            }
        }
        //print answer
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
