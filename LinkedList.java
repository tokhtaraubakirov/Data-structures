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
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void addNode(int num){
        Node newNode = new Node(num);
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void getSize(){
        int size = 0;
        for(Node i = head; i != null; i = i.next){
            size++;
        }
        System.out.println();
        System.out.print(size);
    }

    public void reverseList(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.print(prev + " ");
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
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

        list.addNode(54);

        list.displayList();
        list.getSize();
        list.reverseList();
        list.displayList();
    }
}