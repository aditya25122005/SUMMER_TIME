package cf;

import java.util.HashSet;
import java.util.Scanner;

public class Deletive_Editing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        while(N-->0){
            String s= sc.next();
            String a= sc.next();
            char [] arr= s.toCharArray();
            char [] res= a.toCharArray();
            int n=arr.length;
            int len=res.length;
            if(Solve(arr, res, n, len)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
    public static boolean Solve(char[] arr, char [] res, int N, int n){
        if(n>N){
            return false;
        }
        int i=N-1;
        int j=n-1;
        HashSet<Character> hh= new HashSet<>();
        while(i>=0 && j>=0){
            if(arr[i]==res[j]){
                if(hh.contains(arr[i])) return false;
                i--;
                j--;
            }
            else{
                hh.add(arr[i]);
                i--;
            }
        }
        return j<0;

    }
}
