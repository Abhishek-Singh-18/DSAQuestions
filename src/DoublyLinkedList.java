public class DoublyLinkedList {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertFirst(10);
        dll.InsertFirst(20);
        dll.InsertFirst(30);
        dll.display();
    }

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public void InsertFirst(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}