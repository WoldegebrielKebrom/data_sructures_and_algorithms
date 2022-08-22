package stack;

// Stack - LIFO operation (last in first out)
//        bottom -> [item1, item2, item3, item4] <- top

import java.util.EmptyStackException;

public class IntStack {
    private int [] stack;
    private int top;
    private int size;

    public IntStack() {
        this.top = -1;
        this.size = 50;
        this.stack = new int[50];
    }

    public IntStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new int[this.size];
    }

    public boolean push(int item) {
        if(!isFull()) {
            this.top++;
            this.stack[this.top] = item;
            return true;
        }
            return false;
    }

    public int pop()  {
        // this syntax will return and decrement top at the same time
//        if(!isEmpty()) return this.stack[top--];
//        return -1;

        try {
             return this.stack[top--];
        } catch (Error e) {
            throw new Error(e);
        }
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }


    public boolean isFull() {
        return (this.top == this.stack.length-1);
    }
}
