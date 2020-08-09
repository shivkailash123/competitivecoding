package binarytree.Binarysearchtree;

class Node {
	int data;
	Node left;
	Node right;

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

public class BinarySearchTree {
	public Node createNode(int data) {
		Node dataNode = new Node();
		dataNode.data = data;
		dataNode.left = null;
		dataNode.right = null;
		return dataNode;
	}

	public Node createBst(int data, Node node) {

		if (node == null) {
			return this.createNode(data);
		} else if (node.data > data) {
			node.left = createBst(data, node.left);
		} else if (node.data < data) {
			node.right = createBst(data, node.right);
		}

		return node;
	}

	public void printNode(Node node) {
		if (node == null)
			return;
		printNode(node.left);
		if (node.left == null && node.right == null) {
			System.out.println(node.data);
		}
		printNode(node.right);
	}

	public static void main(String[] args) {

		Node node = null;
		BinarySearchTree bst = new BinarySearchTree();
		node = bst.createBst(5, node);
		node = bst.createBst(10, node);
		node = bst.createBst(4, node);
		node = bst.createBst(11, node);
		node = bst.createBst(8, node);
		node = bst.createBst(3, node);
		bst.printNode(node);

	}

}
