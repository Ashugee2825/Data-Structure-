package Lab1;

class SinglyLinkedListWithRecursiveReverse {
    Node head;

    public SinglyLinkedListWithRecursiveReverse() {
        this.head = null;
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Recursive method to reverse the list
    public Node reverseRecursive(Node current, Node prev) {
        if (current == null) {
            return prev;
        }
        Node next = current.next;  // Store the next node
        current.next = prev;       // Reverse the current node's pointer
        return reverseRecursive(next, current);  // Recur for the next node
    }

    // Method to initiate the recursive reverse
    public void reverse() {
        head = reverseRecursive(head, null);
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedListWithRecursiveReverse list = new SinglyLinkedListWithRecursiveReverse();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.reverse();
        list.display(); // Output: 30 -> 20 -> 10 -> null
    }
}
