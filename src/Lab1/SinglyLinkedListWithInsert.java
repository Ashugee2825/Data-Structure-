package Lab1;

class SinglyLinkedListWithInsert {
    Node head;

    public SinglyLinkedListWithInsert() {
        this.head = null;
    }

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    // Method to add a node at a specific position
    public void addAtPosition(int data, int position) {
        if (position <= 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                addLast(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
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
        SinglyLinkedListWithInsert list = new SinglyLinkedListWithInsert();
        list.addFirst(10);
        list.addLast(30);
        list.addAtPosition(20, 1);
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
