package queueimp;

import java.util.Scanner;

class Opeartion {

	int a[] = new int[10];
	int i = 0;
	int j = 0;

	public void push(int data) {
		if (i == 9) {
			System.out.println("Data is overflow");
			return;
		}

		a[i] = data;
		i++;

	}

	public int pop() {
		
		if (j > 9) {
			System.out.println("Data is not present");
			return 0;
		} else {
			
			return a[j++];
		}
	}

}

public class QueueImplementation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Opeartion ope = new Opeartion();
		ope.push(2);
		ope.push(3);
		ope.push(4);
		System.out.println(ope.pop());
		System.out.println(ope.pop());
		System.out.println(ope.pop());
		System.out.println(ope.pop());
		
	}

}

//public class Queue<T> implements Iterable<T> {
//
//	  private java.util.LinkedList<T> list = new java.util.LinkedList<T>();
//
//	  public Queue() {}
//
//	  public Queue(T firstElem) {
//	    offer(firstElem);
//	  }
//
//	  // Return the size of the queue
//	  public int size() {
//	    return list.size();
//	  }
//
//	  // Returns whether or not the queue is empty
//	  public boolean isEmpty() {
//	    return size() == 0;
//	  }
//
//	  // Peek the element at the front of the queue
//	  // The method throws an error is the queue is empty
//	  public T peek() {
//	    if (isEmpty()) throw new RuntimeException("Queue Empty");
//	    return list.peekFirst();
//	  }
//
//	  // Poll an element from the front of the queue
//	  // The method throws an error is the queue is empty
//	  public T poll() {
//	    if (isEmpty()) throw new RuntimeException("Queue Empty");
//	    return list.removeFirst();
//	  }
//
//	  // Add an element to the back of the queue
//	  public void offer(T elem) {
//	    list.addLast(elem);
//	  }
//
//	  // Return an iterator to alow the user to traverse
//	  // through the elements found inside the queue
//	  @Override
//	  public java.util.Iterator<T> iterator() {
//	    return list.iterator();
//	  }
//	}
