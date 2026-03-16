package cf;

import java.util.*;

public class Extremely_Round {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        List<Integer> ll= new ArrayList<>();
        for(int i=1;i<=10;i++){
            ll.add(i);
        }
        for(int i=20;i<=100;i+=10){
            ll.add(i);
        }
        for(int i=200;i<=1000;i+=100){
            ll.add(i);
        }
        for(int i=2000;i<=10000;i+=1000){
            ll.add(i);
        }
        for(int i=20000;i<=100000;i+=10000){
            ll.add(i);
        }
        for(int i=200000;i<=1000000;i+=100000){
            ll.add(i);
        }
        Collections.sort(ll);


        
        while(T-->0){
            int n= sc.nextInt();
            int c=0;
            boolean ok=true;
            for(int num: ll){
                if(num<=n){
                    c++;
                }
                else{
                    break;
                }
            }
            System.out.println(c);
        }
    }
    
}
