package Java_3rd_year.stack;
import java.util.Stack;

public class Queue_using_2_stack {
    Stack<Integer> st1 = new Stack<>(); // For enqueue operation
    Stack<Integer> st2 = new Stack<>(); // For dequeue operation

    public void enqueue(int x) {
        // Enqueue is simple. Just push the element to st1.
        st1.push(x);
    }

    public int dequeue() {
        if (empty()) {
            throw new NullPointerException("Empty Queue");
        }
        // If st2 is empty, transfer all elements from st1 to st2.
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        // The front element is now at the top of st2.
        return st2.pop();
    }

    public int front() {
        if (empty()) {
            throw new NullPointerException("Empty Queue");
        }
        // If st2 is empty, transfer all elements from st1 to st2.
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        // The front element is at the top of st2.
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}