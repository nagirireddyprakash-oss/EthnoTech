class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;
        n3.next = n1; // Circular

        Node temp = n1;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != n1);
    }
}