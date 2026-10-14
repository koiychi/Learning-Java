class Node4 {
    int data;
    Node4 next;
}

public class RemoveMiddleNode_Rodriguez {
    public static void main(String[] args) {
        Node4 first = new Node4();
        Node4 second = new Node4();
        Node4 third = new Node4();

        first.data = 10;
        second.data = 20;
        third.data = 30;

        first.next = second;
        second.next = third;
        third.next = null;

	System.out.println("Original List:");
	printList(first);

	first.next = third;

	System.out.println("\nAfter removing the middle node (20):");
	printList(first);
    }

	public static void printList(Node4 current) {
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}