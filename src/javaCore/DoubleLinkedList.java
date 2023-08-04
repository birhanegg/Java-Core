package javaCore;

public class DoubleLinkedList {

	Node head, tail;

	static class Node {
		int data;
		Node prev, next;

		Node(int data) {
			this.data = data;

		}
	}

	public void inserLast(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = tail = newNode;
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void inserFirst(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = tail = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void print() {

		if (head == null)
			System.out.println("the list is Empty.");
		else {
			Node temp = head;
			System.out.print("\nhere is the list: ");

			while (temp != null) {
				System.out.print(temp.data);
				if (temp.next != null)
					System.out.print(", ");
				temp = temp.next;
			}

		}
	}

	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.inserLast(11);
		dl.inserLast(12);
		dl.inserLast(13);

		dl.print();

		dl.inserFirst(14);
		dl.inserFirst(15);
		dl.inserFirst(16);

		dl.print();
	}
}
