
package javaCore;

// Java program to implement
// a Singly Linked List
public class fullLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		Node temp=head;
		head= newNode;
		newNode.next=temp;
	}	
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void display() {
		Node temp = head;
		System.out.print("\nthe linked list is:");
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		fullLinkedList test = new fullLinkedList();
		test.insertLast(1);
		test.insertLast(2);
		test.insertLast(3);
		test.insertLast(4);
		test.insertLast(5);
		test.insertFirst(6);
		test.insertFirst(7);
		test.insertLast(8);

		test.display();
	}

}