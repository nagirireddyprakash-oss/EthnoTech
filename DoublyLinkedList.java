class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);

        n1.next = n2;
        n2.prev = n1;

        System.out.println(n1.data);
        System.out.println(n1.next.data);
    }
}