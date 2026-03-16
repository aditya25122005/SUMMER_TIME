package cf;

import java.util.Scanner;

public class makeItDivBy25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            String num= sc.next();
            System.out.println(Solve(num));
           
            
        }
    }
    // 71345
    public static int Solve(String num){
        boolean first_five=false;
        boolean first_zero=false;
        int zi=-1;
        int fi=-1;
        int ansf=0;
        int ansz=0;

        for(int i=num.length()-1;i>=0;i--){
            char ch= num.charAt(i);
            if(ch=='5' && first_five==false){
                first_five=true;
                fi=i;
            }
            else if(!first_five){
                ansf++;
            }

            if(ch=='0' && first_zero==false){
                first_zero=true;
                zi=i;
            }
            else if(!first_zero){
                ansz++;
            }

            if(first_five && i!=fi){
                if(ch=='2' || ch=='7'){
                    break;
                }
                else{
                    ansf++;
                }
            }

            if(first_zero && i!=zi){
                if(ch=='0' || ch=='5'){
                    break;
                }
                else{
                    ansz++;
                }
            }
        }
        return (Math.min(ansf,ansz));

    }
}
