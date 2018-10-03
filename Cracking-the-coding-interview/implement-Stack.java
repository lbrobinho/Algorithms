public class Stack<T> {

	// create a nested class to create stacknode class
	public static class StackNode<T> {

		private T data;
		private StackNode<T> next;

		// create a constrcutor
		public StackNode(T data) {
			this.data = data;
		}
	}

	// create a top elements
	public StackNode<T> top;

	// pop
	public StackNode<T> pop() {

		if (top == null) throw new EmptyStackException;
		T item = top.data;
		top = top.next;
		return item;
	}

	// push
	public void push(T data) {

		StackNode<T> newTop = new StackNode<T>(data);
		newTop.next = top;
		top = newTop;
	}

	// peek
	public StackNode<T> peek() {

		// check Stack is empty
		if (top == null) throw new EmptyStackException;

		return top.data;
	}

	// isEmpty
	public boolean isEmpty() {

		return top == null;
	}
}