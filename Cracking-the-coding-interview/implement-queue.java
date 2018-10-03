public class myQueue<T> {

	public static class QueueNode<T> {

		// create fields to includes data and next pointer
		private T data;
		private QueueNode<T> next;

		// create constructor
		public QueueNode(T data) {
			this.data = data;
		}
	}

	public QueueNode<T> first;
	public QueueNode<T> last;


	// add from last
	public void add(T data) {


		// create new Queue node
		QueueNode<T> t = new QueueNode<T>(data);

		
		// check last is null
		if (last != null) {
			last.next = t;
		}

		last = t;

		// check if first is null
		if (first == null) {
			first == last;
		}
	}

	// remove first
	public QueueNode<T> remove {

		if (first == null) throw new EmptyQueuqException;

		T data = first.data;
		first = first.next;

		if (first == null) {
			last == null;
		}
		return data;
	}

	// peek from first
	public QueueNode<T> peek {

		if (first == null) throw new EmptyQueuqException;
		return first.data;
	}

	// is empty
	public boolean isEmpty() {

		return first == null;
	}
}