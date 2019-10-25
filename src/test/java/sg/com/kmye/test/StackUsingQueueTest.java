package sg.com.kmye.test;


import org.junit.Test;
import sg.com.kmye.algo.StackUsingQueue;

import static org.junit.Assert.assertEquals;


public class StackUsingQueueTest {

    @Test
    public void checkInitStack() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals( "4 3 2", stack.toString());
    }

    @Test
    public void checkPoppedValue() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals( 4,  stack.pop());
    }
}
