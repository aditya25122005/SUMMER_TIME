package cf;

import java.util.HashSet;
import java.util.Scanner;

public class Antons_AND_LETTERS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        HashSet<Character> hh= new HashSet<>();
        for(int i=1;i<s.length()-1;i+=3){
            hh.add(s.charAt(i));
            
        }
        System.out.println(hh.size());
    }
}
