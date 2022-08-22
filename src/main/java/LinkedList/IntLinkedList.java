package LinkedList;

public class IntLinkedList {
    private Node head;

    public IntLinkedList(int item) {
        this.head = new Node();
        this.head.value  = 1;
        this.head.link = null;

    }

    public boolean insertItem(int item) {
        Node n = new Node();

        // insert node at the beginning of the link

        //        n.value = item;
        //        n.link = this.head;
        //        this.head = n;
        //        return true;

        // insert node at the end of the link

        Node new_node = head;
        while(new_node.link!=null) {
            new_node = new_node.link;
        }
        n.value = item;
        n.link = null;
        new_node.link = n;
        return true;
    }

    public void printList() {
        Node next = this.head;
        while(next!=null) {
            System.out.println(next.value);
            next = next.link;
        }
    }

    public boolean deleteItem(int item) {
        if(head.link.value == item) {
            head = head.link.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while(true) {
                if(y==null || y.value==item) {
                    break;
                } else {
                    x = y;
                    y = y.link;
                }
            }
            if(y != null){
                x.link = y.link;
                return true;
            } else {
                return false;
            }
        }

    }

    public void sortList() {
        int c = 0;
        Node a = head.link;
        while(a.link != null) {
            Node b = head.link;
            while(b.link != null) {
                if(b.value < b.link.value) {
                    c = b.value;
                    b.value = b.link.value;
                    b.link.value = c;
                }
                b = b.link;
            }
            a = a.link;
        }
    }

    class Node {
         private int value;
         private Node link;
    }
}
