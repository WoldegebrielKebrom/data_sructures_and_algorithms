package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        dList list = new dList(2);
        list.insertItem(3);
        list.insertItem(6);

        list.printList();

        System.out.println();

        list.deleteItem(3);
        list.printList();

    }
}
