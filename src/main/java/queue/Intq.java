package queue;

// Queue  - FIFO operation (first in first out)
//        bottom -> [item1, item2, item3, item4] <- top


public class Intq {
    private int [] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public Intq() {
        this.size = 100;
        this.total = 0;
        this.front = 0;
        this.rear = 0;
        this.q = new int[size];
    }

    public Intq(int size) {
        this.size = size;
        this.total = 0;
        this.front = 0;
        this.rear = 0;
        this.q = new int[this.size];
    }

    public boolean enqueue(int item) {
        if(isFull()) {
            System.out.println("is full");
            return false;

        }
        else {
          total++;
          q[rear] = item;
          rear = (rear + 1) % size;
          return true;
        }
    }

    public int dequeue() {
        int item = q[this.front];
        this.total--;
        front = (front + 1) % size;
        return item;
    }


    private boolean isFull() {
        return size == total;
    }

    public void showAll() {
        int f = this.front;
        if(this.total!=0) {
            for(int i=0; i < total; i++) {
                System.out.println(" "+ this.q[f]);
                f = (f + 1) % size;
            }
        }

    }
}
