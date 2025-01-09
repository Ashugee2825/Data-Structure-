package Lab1;

class SinglyLinkedListWithConcat {
    Node head;

    public SinglyLinkedListWithConcat() {
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

    // Method to concatenate another list
    public void concatenate(SinglyLinkedListWithConcat list) {
        if (head == null) {
            head = list.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = list.head;
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
        SinglyLinkedListWithConcat list1 = new SinglyLinkedListWithConcat();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);

        SinglyLinkedListWithConcat list2 = new SinglyLinkedListWithConcat();
        list2.addLast(40);
        list2.addLast(50);

        list1.concatenate(list2);
        list1.display(); // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null
    }
}
