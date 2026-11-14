

public class LinkedList {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(20);
        System.out.print("list are::");
        list.display();
        System.out.println("\n");
        System.out.println("Deleted element:" + list.deleteFirst());
        System.out.println("\nAfter deleting first element: ");
        list.display();
        System.out.println("\nAfter deleting last element:");
        list.deleteLast();
        list.display();

    }
    private Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void addFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public int deleteFirst(){
        int value=head.data;
        head=head.next;

        if(head==null){
         Node tail=null;
        }
        return value;
    }
    //or
//    public void deleteFirst(){
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        head=head.next;
//    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
}

