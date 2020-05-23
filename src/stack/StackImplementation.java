package stack;

class Operation {

	final int buttom = -1;
	int a[] = new int[10];
	int i = 0;

	public void push(int data) {
		a[i] = data;
		System.out.println("In push method " + a[i]);
		i++;

	}

	public int pop() {
		i--;

		if (i < 0) {
			System.out.println("Stack is empty");
			return 0;
		}
		int val = a[i];
		a[i] = 0;
		return val;
	}

}

public class StackImplementation {

	public static void main(String[] args) {

		Operation oper = new Operation();
		oper.push(2);
		System.out.println(oper.pop());
		System.out.println(oper.pop());

	}

}
