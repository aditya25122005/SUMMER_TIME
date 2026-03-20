package cf;
import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=  new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int taxi=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>=4){
                arr[i]-=4;
                taxi++;
            }
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num: arr){
            if(num!=0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }

        while(map.containsKey(3)){
            if(map.containsKey(1)){
                taxi++;
                map.put(3,map.get(3)-1);
                if(map.get(3)==0){
                    map.remove(3);
                }
                map.put(1,map.get(1)-1);
                if(map.get(1)==0){
                    map.remove(1);
                }
            }
            else{
                taxi++;
                map.put(3,map.get(3)-1);
                if(map.get(3)==0){
                    map.remove(3);
                }
            }
        }
        while(map.containsKey(2)){
            if(map.get(2)>=2){
                taxi++;
                map.put(2,map.get(2)-2);
                if(map.get(2)==0){
                    map.remove(2);
                }
            }
            else if(map.containsKey(1)){
                if(map.get(1)>=2){
                    taxi++;
                    map.put(2,map.get(2)-1);
                    if(map.get(2)==0){
                        map.remove(2);
                    }
                    map.put(1,map.get(1)-2);
                    if(map.get(1)==0){
                        map.remove(1);
                    }
                }
                else if(map.get(1)==1){
                    taxi++;
                    map.put(2,map.get(2)-1);
                    if(map.get(2)==0){
                        map.remove(2);
                    }
                    map.put(1,map.get(1)-1);
                    if(map.get(1)==0){
                        map.remove(1);
                    }

                }
            }
            else{
                taxi++;
                map.put(2,map.get(2)-1);
                if(map.get(2)==0){
                    map.remove(2);
                }
            }
        }
        if(map.containsKey(1)){
            int count=map.get(1);
            while(count>0){
                count-=4;
                taxi++;
            }
        }
        System.out.println(taxi);
        
        
    }
}
