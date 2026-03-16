package cf;

import java.util.Scanner;

public class Walking_Master{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();
            System.out.println(Solve(x1, y1, x2, y2));

        }
    }
    // -1, 0, -1,2
    public static int Solve(int x1, int y1, int x2, int y2){
        int step=0;
        if(y1>y2){
            return -1;
        }
        if(y1<y2){
            int add = y2-y1;
            y1+=add;
            x1+=add;
            step+=add;
        }

        if(x2>x1) {
            return -1;
        }
        else{
            
            step+= (x1-x2);
            return step;
        }

    }
}