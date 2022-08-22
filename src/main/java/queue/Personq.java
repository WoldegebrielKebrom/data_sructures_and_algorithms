package queue;

// Queue  - FIFO operation (first in first out)
//        bottom -> [item1, item2, item3, item4] <- top


public class Personq {
    private Person [] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public Personq() {
        this.size = 100;
        this.total = 0;
        this.front = 0;
        this.rear = 0;
        this.q = new Person[size];
    }

    public Personq(int size) {
        this.size = size;
        this.total = 0;
        this.front = 0;
        this.rear = 0;
        this.q = new Person[this.size];
    }

    public boolean enqueue(Person item) {
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

    public Person dequeue() {
        Person item = q[this.front];
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
                System.out.println(" "+ this.q[f].toString());
                f = (f + 1) % size;
            }
        }

    }
}
