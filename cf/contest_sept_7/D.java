package cf.contest_sept_7;
import java.util.ArrayList;
import java.util.Scanner;
public class D {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt(); 
            ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
            for (int i = 0; i <= n; i++) ll.add(new ArrayList<>());

            for (int i = 0; i < n; i++) {
                ll.get(b[i]).add(i);
            }

            boolean ok = true;
            for (int v = 1; v <= n; v++) {
                if (ll.get(v).size() % v != 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                System.out.println(-1);
                continue;
            }
            int[] a = new int[n];
            int lb = 1;

            for (int v = 1; v <= n; v++) {
                int m = ll.get(v).size();
                for (int i = 0; i < m; i += v) {
                    for (int j = 0; j < v; j++) {
                        a[ll.get(v).get(i + j)] = lb;
                    }
                    lb++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
