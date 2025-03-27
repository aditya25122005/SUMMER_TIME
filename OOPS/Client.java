package OOPS;

public class Client {
    public static void main(String[] args) {
        //case -1 
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // obj.fun();
        // obj.fun1();

        //case-2

        // P obj = new C();
        // System.out.println(obj.d);  //1 
        // System.out.println(obj.d1);  //10
        // obj.fun();   //Fun in C
        // obj.fun1();  //fun1 in P
        // System.out.println(((C)obj).d2);

        //Case-3
        // C obj = new P();  //Not possible

        //case -4
        C obj = new C();
        obj.fun();
        obj.fun1();
        obj.fun2();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);

        
        
       

    }
}
