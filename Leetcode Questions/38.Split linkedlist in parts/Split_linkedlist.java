public class Split_linkedlist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 3; // Number of parts
        Node[] parts = splitListToParts(head, k);

        for (int i = 0; i < k; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            printList(parts[i]);
        }
    }
    public static Node[] splitListToParts(Node root, int k) {
        Node[] parts = new Node[k];
        int length = 0;
        Node current = root;

        // Calculate the length of the linked list
        while (current != null) {
            length++;
            current = current.next;
        }

        int partSize = length / k;
        int extraNodes = length % k;

        current = root;
        for (int i = 0; i < k; i++) {
            parts[i] = current;
            int currentPartSize = partSize + (i < extraNodes ? 1 : 0);

            for (int j = 0; j < currentPartSize - 1 && current != null; j++) {
                current = current.next;
            }

            if (current != null) {
                Node nextPartHead = current.next;
                current.next = null; // Split the list
                current = nextPartHead; // Move to the next part
            }
        }

        return parts;
    }
}
