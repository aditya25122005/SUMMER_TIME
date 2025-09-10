package cf.contest_sept_7;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++){
            long a=sc.nextLong();
            long b= sc.nextLong();

            if ((b & 1) == 1) { 
                if ((a & 1) == 1) {
                    System.out.println(a * b + 1);
                } else {
                    System.out.println(-1);
                }
                continue;
            }

            long bb = b;
            int z = 0;
            while ((bb & 1) == 0) {
                bb >>= 1;
                z++;
            }

            if ((a & 1) == 1 && z == 1) {
                System.out.println(-1);

                continue;
            }


            long mink = ((a & 1) == 1) ? 2 : 1;
            long s1 = a *mink + b/ mink;
            long s2 = a * (b / 2) + 2;

            System.out.println(Math.max(s1, s2));
        }

        sc.close();
    }
}
