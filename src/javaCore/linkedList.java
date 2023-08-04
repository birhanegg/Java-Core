package javaCore;

public class linkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
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

	public void insertFirst(int data) {
		Node newNode = new Node(data);

		Node temp = head;
		head = newNode;
		newNode.next = temp;

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("the list is Empty.");
		} else {
			Node temp = head;
			head = temp.next;
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("the list is Empty.");
		} 
		
		else {
			Node temp = head, last=null;
			while (temp.next != null) {
				last = temp;
				temp = temp.next;
			}
			last.next= null;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("the list is Empty.");
		}

		else {
			Node temp = head;
			System.out.print("\nhere are the list ");
			while (temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		linkedList ls = new linkedList();
	
		
		ls.insertLast(1);
		ls.insertLast(2);
		ls.insertLast(3);
		ls.insertLast(4);
		ls.insertLast(5);

		ls.insertFirst(6);
		ls.insertFirst(7);

		ls.print();

		ls.deleteFirst();
		ls.deleteLast();
		ls.print();

	}

}
