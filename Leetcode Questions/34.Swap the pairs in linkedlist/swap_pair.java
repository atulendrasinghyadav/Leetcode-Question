public class swap_pair {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = swapPairs(head);

        System.out.println("Linked List after swapping pairs:");
        printList(head);
    }
    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = head.next;
        Node prev = null;
        Node current = head;

        while (current != null && current.next != null) {
            Node nextPair = current.next.next;
            Node second = current.next;

            second.next = current;
            current.next = nextPair;

            if (prev != null) {
                prev.next = second;
            }

            prev = current;
            current = nextPair;
        }

        return newHead;
    }
}
