package apr;

public class abstract_demoClient {
    
    public static void main(String[] args) {
        abstract_Demo ab= new abstract_demo2();
        ab.PayOnline();




        abstract_Demo ab1 = new abstract_Demo() {
            @Override
            public void PayOnline() {
            }
        };  




    }

}
