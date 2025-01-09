package Lab1;

class SinglyLinkedListWithDelete {
    Node head;

    public SinglyLinkedListWithDelete() {
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

    // Method to delete the first node
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to delete the last node
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Method to delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (position <= 0) {
            deleteFirst();
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                return;
            }
            current.next = current.next.next;
        }
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
        SinglyLinkedListWithDelete list = new SinglyLinkedListWithDelete();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null
        list.deleteFirst();
        list.display(); // Output: 20 -> 30 -> 40 -> null
        list.deleteLast();
        list.display(); // Output: 20 -> 30 -> null
        list.deleteAtPosition(1);
        list.display(); // Output: 20 -> null
    }
}

