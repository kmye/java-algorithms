package sg.com.kmye.algo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is a stack implemented using queue
 */
public class StackUsingQueue {

    private Queue<Integer> mainQueue = new LinkedList<>();

    private int top;

    public StackUsingQueue() {

    }

    public void push(int x) {
        mainQueue.add(x);
        int sz = mainQueue.size();
        while (sz > 1) {
            mainQueue.add(mainQueue.remove());
            sz--;
        }
    }

    public int pop() {
        top = mainQueue.remove();
        return top;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        mainQueue.forEach(integer -> sb.append(integer).append(" "));
        return sb.toString().trim();
    }
}
