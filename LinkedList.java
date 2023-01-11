//Single LinkedList implementation;
public class LinkedList {
    Node head;

    public static class Node {
        int data; //defining our data;
        Node next; //defining next pointer to the next NODE;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList() {
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[]args){
        LinkedList list = new LinkedList();

        Node node3 = new Node(10);
        node3.next = null;

        Node node2 = new Node(5);
        node2.next = node3;

        Node node1 = new Node(1);
        node1.next = node2;

        list.head = node1;

        list.displayList();
    }
}