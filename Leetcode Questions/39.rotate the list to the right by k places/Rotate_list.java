public class Rotate_list {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2; // Number of places to rotate
        Node rotatedHead = rotateRight(head, k);
        printList(rotatedHead);
    }
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Connect the last node to the head to make it circular
        current.next = head;

        // Find the new tail: (length - k % length - 1)th node
        k = k % length;
        int newTailIndex = length - k - 1;
        current = head;

        for (int i = 0; i < newTailIndex; i++) {
            current = current.next;
        }

        // The new head is the next node of the new tail
        Node newHead = current.next;
        current.next = null; // Break the circular link

        return newHead;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
