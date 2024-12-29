package CodingQNAs.StacksAndQues.InterviewQues;

import java.util.Stack;

public class Q_232_Impliment_Queue_Using_Stacks {
    private final Stack<Integer> first;
    private final Stack<Integer> second;

    public Q_232_Impliment_Queue_Using_Stacks() {
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public static void main(String[] args) {
        Q_232_Impliment_Queue_Using_Stacks st = new Q_232_Impliment_Queue_Using_Stacks();

        st.push(23);
        st.push(33);
        st.push(43);

        System.out.println("Pop " + st.pop());
        System.out.println("Peek " + st.peek());
        System.out.println("isEmpty " + st.empty());
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
