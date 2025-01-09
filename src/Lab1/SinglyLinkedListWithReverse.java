package Lab1;

class SinglyLinkedListWithReverse {
    Node head;

    public SinglyLinkedListWithReverse() {
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

    // Method to reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  // Store the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move the pointers one position ahead
            current = next;
        }
        head = prev;  // Update the head to the new first node
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
        SinglyLinkedListWithReverse list = new SinglyLinkedListWithReverse();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.reverse();
        list.display(); // Output: 30 -> 20 -> 10 -> null
    }
}
