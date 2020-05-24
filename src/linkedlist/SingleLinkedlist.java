package linkedlist;

import java.io.InputStreamReader;
import java.util.Scanner;

class Node {
	Node next;
	int data;
}

class Operation {
	Node node = null;
	Node currentNode = null;

	public void addNode(int data) {
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = currentNode;
		currentNode = newNode;

	}

	public void printData() {
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}

public class SingleLinkedlist {
	public static void main(String[] args) {
		Operation ope = new Operation();
		Scanner scanner = new Scanner(System.in);
		ope.addNode(2);
		ope.addNode(3);
		ope.addNode(5);
		ope.addNode(10);
		
		ope.printData();
		

	}
}
