package cf.contest_18JAN2026;




import java.io.*;
import java.util.*;

public class D {

    static FastScanner fs = new FastScanner(System.in);

    public static void main(String[] args) throws Exception {
        StringBuilder ans = new StringBuilder();



            int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            long h = fs.nextLong();

            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = fs.nextLong();
            }

            long[] add = new long[n + 1];
            int[] last = new int[n + 1];
            Arrays.fill(last, -1);

            int time = 0;

            for (int i = 0; i < m; i++) {
                int idx = fs.nextInt();
                long val = fs.nextLong();

                if (last[idx] != time) {
                    last[idx] = time;
                    add[idx] = 0;
                }

                add[idx] += val;
                if (a[idx] + add[idx] > h) {
                    time++;
                }
            }

            for (int i = 1; i <= n; i++) {
                long cur = a[i] + (last[i] == time ? add[i] : 0);
                ans.append(cur);
                if (i < n) ans.append(' ');
            }


            ans.append('\n');
        }

        System.out.print(ans.toString());
    }

    // Fast input
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = read(); } while (c <= ' ');
            if (c == '-') {
                sign = -1;
                c = read();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        long nextLong() throws IOException {
            int c, sign = 1;
            long val = 0;
            do { c = read(); } while (c <= ' ');
            if (c == '-') {
                sign = -1;
                c = read();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}