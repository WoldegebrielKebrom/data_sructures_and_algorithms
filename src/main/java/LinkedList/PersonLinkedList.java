package LinkedList;

public class PersonLinkedList {
    private Node head;

    public PersonLinkedList(Person person) {
        this.head = new Node();
        this.head.value  = person;
        this.head.link = null;

    }

    public boolean insertItem(Person person) {
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
        n.value = person;
        n.link = null;
        new_node.link = n;
        return true;
    }

    public void printList() {
        Node next = this.head;
        while(next!=null) {
            System.out.println(next.value.toString());
            next = next.link;
        }
    }

    public boolean deleteItem(String name) {
        if(name.equals(head.value.getName())) {
            head = head.link.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while((y != null) && !(y.value.getName().equals(name))) {
                x = y;
                y = y.link;
            }
            if(y != null){
                x.link = y.link;
                return true;
            } else {
                return false;
            }
        }

    }

//    public void sortList() {
//        int c = 0;
//        Node a = head.link;
//        while(a.link != null) {
//            Node b = head.link;
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
        private Person value;
        private Node link;
    }
}
