package cf.contest_sept_13;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            int n= sc.nextInt();
            long m= sc.nextLong();
            
            long[] a= new long[n];
            long[] b= new long[n];

            for(int i=0;i<n;i++){
                a[i]= sc.nextLong();
                b[i]=sc.nextLong();
            }
            long pts=0;
            long prevTime=0;
            long prevSide=0;
            for(int i=0;i<n;i++){
                long dt=a[i]-prevTime;
                long parity=prevSide^b[i];

                if (dt < parity) {
                    pts = -1;
                    break;
                }

                if(dt%2==parity){
                    pts+=dt;
                }else{
                    pts+=dt-1;
                }
                prevSide=b[i];
                prevTime=a[i];
            }
            long dt=m-prevTime;
            pts+=dt;
            System.out.println(pts);


        }
    }
}
