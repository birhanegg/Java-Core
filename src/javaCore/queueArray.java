package javaCore;

import java.util.Iterator;

public class queueArray {
	static int front, rare, capacity;
	static int queue[];

	queueArray(int size) {
		capacity = size;
		front = rare = 0;
		queue = new int[capacity];
	}

	public void enqueue(int item) {
		if (rare == queue.length) {
			resize();
			queue[rare] = item;
		} else {
			queue[rare] = item;
			rare++;
		}
	}

	public void resize() {

		int temp[] = new int[2 * queue.length];
		for (int i = 0; i < queue.length; i++) {
			temp[i] = queue[i];
		}
		queue = temp;
	}

	public void dequeue() {
		if (front == rare) {
			System.out.println("array is empty.");
		} else {
			front++;

		}
	}

	public void peek() {
		if (front == rare) {
			System.out.println("array is empty.");
		} else {
			System.out.println("\nthe top of the queue is\n" + queue[front]);

		}
	}

	public void print() {
		if (front == rare) {
			System.out.println("array is empty.");
		} else {
			for (int i = front; i < rare; i++) {
				System.out.print(queue[i] + " ");
			}

		}
	}

	public static void main(String[] args) {
		queueArray Q = new queueArray(10);

		System.out.println("queue before Enqueue");
		Q.print();

		Q.enqueue(1);
		Q.enqueue(2);
		Q.enqueue(3);
		Q.enqueue(4);
		Q.enqueue(5);
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(8);
		Q.enqueue(9);
		Q.enqueue(10);
		Q.enqueue(11);
		Q.enqueue(12);
		Q.enqueue(13);
		System.out.println("the queue after Enqueue");
		Q.print();
		Q.peek();

		Q.dequeue();
		Q.dequeue();
		System.out.println("\nthe queue after two dequeue");
		Q.print();

		Q.peek();

	}
}
