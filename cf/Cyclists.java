package cf;
import java.util.*;
public class Cyclists {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int p= sc.nextInt();
            int m= sc.nextInt();

            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int winCard=arr[p-1];
            arr[p-1]=6000;

            int total=0;
            Queue<Integer> q= new LinkedList<>();
            for(int num: arr){
                q.add(num);
            }
            
            int count=0;
            while(total<m){
                // check if winCard available in Top k Or get min Value in top k
                int min=Integer.MAX_VALUE;
                boolean winP=false;
                int winIdx=-1;
                int minIdx=-1;
                int c=0;
                for(int x: q){
                    if(c==k) break;
                    if(x==6000){
                        winP=true;
                        winIdx=c;
                        break;
                    }
                    if(x<min){
                        min=x;
                        minIdx=c;
                    }
                    c++;
                }
                if(winP){
                    if(total+winCard> m) break;
                    count++;
                    int s= q.size();
                    for(int i=0;i<s;i++){
                        int rm=q.poll();
                        if(i!=winIdx){
                            q.add(rm);
                        }
                    }
                    q.add(6000);
                    
                    total+= winCard;

                }
                else{
                    int s= q.size();
                    for(int i=0;i<s;i++){
                        int rm=q.poll();
                        if(i!=minIdx){
                            q.add(rm);
                        }
                    }
                    q.add(min);
                    if(total+min> m) break;
                    total+= min;
                }
            }
            System.out.println(count);
            

        }
    }
}
