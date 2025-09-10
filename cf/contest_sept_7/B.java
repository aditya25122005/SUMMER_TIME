package cf.contest_sept_7;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p =new int[n];
            int[] q = new int[n];

            for (int i =0; i<n; i++) {
                p[i] = sc.nextInt();
            }
            for (int i =0; i <n; i++) {
                q[i] = n + 1 -p[i];
            }


            for (int i =0; i < n; i++) {
                System.out.print(q[i]);
                if (i < n -1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close(); // 
    }
}
