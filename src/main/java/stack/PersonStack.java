package stack;

// Stack - LIFO operation (last in first out)
//        bottom -> [item1, item2, item3, item4] <- top

public class PersonStack {
    private Person[] stack;
    private int top;
    private int size;

    public PersonStack() {
        this.top = -1;
        this.size = 50;
        this.stack = new Person[50];
    }

    public PersonStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new Person[this.size];
    }

    public boolean push(Person item) {
        if(!isFull()) {
            this.top++;
            this.stack[this.top] = item;
            return true;
        }
        return false;
    }

    public Person pop()  {
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
