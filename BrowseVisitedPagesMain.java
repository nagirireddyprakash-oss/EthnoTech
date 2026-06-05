import java.util.Scanner;

class Node {
    String page;
    Node prev, next;

    Node(String page) {
        this.page = page;
        prev = next = null;
    }
}

class BrowserHistory {
    Node head, tail;

    // Visit New Page
    void visitPage(String page) {
        Node newNode = new Node(page);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println(page + " visited.");
    }

    // Display History
    void displayHistory() {
        if (head == null) {
            System.out.println("History is empty.");
            return;
        }

        System.out.println("\nBrowsing History:");
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }

    // Search Page
    void searchPage(String page) {
        Node temp = head;

        while (temp != null) {
            if (temp.page.equalsIgnoreCase(page)) {
                System.out.println(page + " found in history.");
                return;
            }
            temp = temp.next;
        }

        System.out.println(page + " not found.");
    }

    // Delete Page
    void deletePage(String page) {
        Node temp = head;

        while (temp != null) {
            if (temp.page.equalsIgnoreCase(page)) {

                if (temp == head)
                    head = head.next;

                if (temp == tail)
                    tail = tail.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println(page + " deleted.");
                return;
            }

            temp = temp.next;
        }

        System.out.println(page + " not found.");
    }

    // Count Pages
    void countPages() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Visited Pages: " + count);
    }
}

public class BrowseVisitedPagesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistory bh = new BrowserHistory();

        while (true) {
            System.out.println("\n1.Visit Page");
            System.out.println("2.Display History");
            System.out.println("3.Search Page");
            System.out.println("4.Delete Page");
            System.out.println("5.Count Pages");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter page name: ");
                    bh.visitPage(sc.nextLine());
                    break;

                case 2:
                    bh.displayHistory();
                    break;

                case 3:
                    System.out.print("Enter page to search: ");
                    bh.searchPage(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter page to delete: ");
                    bh.deletePage(sc.nextLine());
                    break;

                case 5:
                    bh.countPages();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}