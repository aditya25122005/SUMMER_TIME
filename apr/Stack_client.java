package apr;

public class Stack_client {
    StackI st1= new StackI(){
        @Override
        public void push(int x) {
            System.out.println("pushing " + x);
        }
        @Override
        public int peek() {
            return 0;
        }
    };
}
