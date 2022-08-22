package DoublyLinkedList;

public class dList {
    private Node head;

    public dList(int item) {
        this.head = new Node();
        this.head.value  = item;
        this.head.next = null;
        this.head.prev = null;


    }

    public boolean insertItem(int item) {
        Node n = new Node();
        n.value = item;
        n.prev = null;
        head.prev = n;
        n.next = head;
        head = n;
        return true;
    }

    public void printList() {
        Node next = this.head;
        while(next!=null) {
            System.out.println(next.value);
            next = next.next;
        }
    }

    public boolean deleteItem(int item) {
        if(head.value == item) {
            head = head.next;
            return true;
        } else {
            Node x = head;
            Node y = head.next;
            while(true) {
                if(y==null || y.value==item) {
                    break;
                } else {
                    x = y;
                    y = y.next;
                }
            }
            if(y != null){
                x.next = y.next;
                return true;
            } else {
                return false;
            }
        }

    }

//    public void sortList() {
//        int c = 0;
//        LinkedList.IntLinkedList.Node a = head.link;
//        while(a.link != null) {
//            LinkedList.IntLinkedList.Node b = head.link;
//            while(b.link != null) {
//                if(b.value < b.link.value) {
//                    c = b.value;
//                    b.value = b.link.value;
//                    b.link.value = c;
//                }
//                b = b.link;
//            }
//            a = a.link;
//        }
//    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

    }
}
